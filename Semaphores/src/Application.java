import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class Application {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*Semaphore is an object that maintains count like: Semaphore sem = new Semaphore(count). we refer to counts as the available permit and we 
		 * can get those using sem.availablePermits()*/
		//Semaphore sem = new Semaphore(0);
		//System.out.println("Available Permits: "+sem.availablePermits());
		/*semaphore count starts from zero . so we can release permits and acquire permits*/
		//sem.release();
		//System.out.println("Available Permits: "+sem.availablePermits());
		/*sem.acquire() will wait on permits to be available then acquire them*/
		//sem.acquire(); //acquire and release are like locking and unlocking.
		//sem.release(); /*in a lock we have to unlock from same thread but in semaphores we can release it from any from withing a program*/
		
		/*Creates a thread pool that creates new threads as needed, but will reuse previously constructed threads when they are available. 
		 * These pools will typically improve the performance of programs that execute many short-lived asynchronous tasks. */
		ExecutorService executor = Executors.newCachedThreadPool();
		for(int i = 0; i<200;i++){
			executor.submit(new Runnable(){
				@Override
				public void run() {
					// TODO Auto-generated method stub
					Connection.getInstance().connect();
				}
			});
		}
		
	/*after the work has been done I should end the executor services*/
		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.DAYS);		
	}

}
