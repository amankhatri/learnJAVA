import java.util.LinkedList;
import java.util.Random;

/*Always remember that the shared data has to be under synchronized block */
public class Processor {
	private final int LIMIT = 10;
	private LinkedList<Integer> list = new LinkedList<Integer>(); 
	private Object lock = new Object();
	public void producer() throws InterruptedException{
		int valueAdded= 0;
		while(true){
			synchronized(lock){
				while(list.size()==LIMIT){
					lock.wait(); //intelligent use of wait
				}
				list.add(valueAdded++);
				lock.notify();
			}
		}
		
	}
	public void consumer() throws InterruptedException{
		Random random = new Random();
		while(true){
			/*Since i want FIFO I would have to removefrom first*/
			
			synchronized(lock) {
				while(list.size() == 0){
					lock.wait();
				}
				System.out.println("List size is " +list.size());
				int valueRemoved = list.removeFirst(); //removeFirst is only in last Linked list and not in the list inteface.	
				System.out.println("Value is: " +valueRemoved);
				lock.notify();
			}	
			/*I want to sleep for some time*/
			Thread.sleep(random.nextInt(1000));
		}
	}
}
