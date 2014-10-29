import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*Allow threads to return values and to thow exceptions*/
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executor = Executors.newCachedThreadPool();
		/*when I submit a task to executor it returns a Future object and it parameterized */
		Future<Integer> future = executor.submit(new Callable<Integer>(){ //Future<?> future = executor.submit(new Callable<Void>(), 
			//if you don't have return values and you want to use all the methods of Future class
			@Override
			public Integer call() throws Exception { // change it to public void call throws Execption if you plan to do Future<?> future = executor.submit(new Callable<Void>()
				// TODO Auto-generated method stub
				// TODO Auto-generated method stub
				Random random = new Random();
				int duration = random.nextInt(4000);
				if(duration>2000){
					throw new Exception("Sleeping for too long");
					//this exception will be thrown by get from future.get in try catch block , this is a type of execution exception. 
				}
				System.out.println("Starting...");
				try {
					Thread.sleep(duration);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Finished Task");
				
				return duration; // change this to null
			}
			
		});
		executor.shutdown();
	
		
		try {
			System.out.println("Returned value from the thread is : " +future.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
			/*to get the message from the  execution execption in if condition we can do 
			 * 	this: */
			System.out.println(e.getMessage()); // displays sleeping for too long
			/*if I want to get real exception i will do */
			IOException ex = (IOException) e.getCause();
			System.out.println("Ex: "+ex);
		}
	}
}