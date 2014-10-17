import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*Synchronization takes some time because the keyword synchronized acquires intrinsic lock on the worker that 
 * is the entire stageOne however there is no data shared between the stageOne and stageTwo. We don't want to run both methods 
 * in one thread however we can run both methods simultaneously in separate threads. This can be done by
 * creating locks. Don't put locks seperately on the objects you write on.*/
/*synchronization can introduce thread contention, which occurs when two or more threads try to access 
 * the same resource simultaneously and cause the Java runtime to execute one or more threads more slowly, 
 * or even suspend their execution. 
 * Starvation and livelock are forms of thread contention. See the section Liveness for more information.*/

public class Worker {
	private Random random = new Random();
	private Object lock1 = new Object();
	private Object lock2 = new Object();
	private List<Integer> list1 = new ArrayList<Integer>();
	private List<Integer> list2 = new ArrayList<Integer>();
	public synchronized void stageOne(){
		synchronized(lock1){
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list1.add(random.nextInt(100));
		}
	}
	public void stageTwo(){
		synchronized(lock2){
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list2.add(random.nextInt(100));	
		}
	}
	public void process(){
		for(int i =0;i<1000;i++){
			stageOne();
			stageTwo();
		}
	}
	public void main(){
		System.out.println("Starting...");
		long start = System.currentTimeMillis();
		/*Fancy way od running thread*/
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				process();
			}
		});
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				process();
			}
		});
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		long end = System.currentTimeMillis();
		System.out.println("Time Taken: " +(end-start));
		System.out.println("List1 Size: "+list1.size()+" list2 Size: "+list2.size());
	}
}
