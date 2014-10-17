import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*Multi Threading*/
class Processor implements Runnable {
	private CountDownLatch latch;
	
	public Processor(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub	
		System.out.println("Started");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*Everytime I call latch.coundDown(). the value in CountDownLatch latch = new CountDownLatch(3); 
		 * of main section will be counted down by one.*/
		latch.countDown();
		
	}
	
}
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*As we know that there are lots of problems with implementing threads (Synchronization) when
		 * threads are continuously accessing data, there are some classes which are safe with threads 
		 * and can work without synchronization. one of them is CountDownLatch. This latch lets you count down
		 * from the argument you give it to its constructor. If a class is a thread safe class we do not
		 * need a synchronization keyword in the name of the method*/
		CountDownLatch latch = new CountDownLatch(3);
		ExecutorService executor = Executors.newFixedThreadPool(3);
		for(int i=0;i<3;i++){
			executor.submit(new Processor(latch));
		}
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //waits untill the latch has counted down to zero
		executor.shutdown();
		try {
			executor.awaitTermination(60, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Completed");

	}

}
