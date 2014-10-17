import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


public class Application {
//	private static final Runnable Runnable() = null;
	/*Blocking queue is First in first out and we will add integers to it. THis is a thread safe class
	 *  */
	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
	}
	private static void producer() throws InterruptedException{
		/*Producer loops indefinitely to generate random number. The idea of producer- consumer:
		 * You have one or more thread(s) that is producing things and  they share common data with others
		 * thats which are using the things which were produced. so producer adds things to queue and 
		 * consumer removes it from the queue and processes items*/
		Random random = new Random();
		while(true){
			/*put will wait after the queue is filled until consumer takes out any value or values. so
			 * it will add values as soon as it sees value*/
			queue.put(random.nextInt(100));
		}
	}
	private static void consumer() throws InterruptedException{
		Random random = new Random();
		while(true){
			Thread.sleep(100);
			/*Randomly*/
			if(random.nextInt(10) == 0){
				/*so if there is no value in queue, the method take will wait until there is a value
				 * in the queue. This doesn't use much resources.*/
				Integer value = queue.take();
				System.out.println("Taken a value: " +value +" ; Queue Size is: " +queue.size() );
			}
		}
	}
}
