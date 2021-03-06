import java.util.Scanner;

/* Two Problems which we might encounter with multiple thread
 * 1) Data being cached
 * 2) Threads in deleting
 *we learn about volatile key word */
		/*The problem occurs when we start to think about how to terminate a thread properly in the cases like the one given below with while loop
		 * We can do that by using Thread Interruptions but here we will do this by shared data. To do this we will use a boolean variable. And  
		 * change the variable running from true to false, we can also interrupt the main method and  in between by using scanner. THis way
		 * always works but there is a catch
		 * Some processors may cache the value of running as true which may result in never ending loop. 
		 * More explanation: So method run is in its separate thread and main always runs in its own little separate thread. However
		 * we call the method processor1.shutDown which ends up interfering with running variable which is used by different thread. 
		 * Being two different threads some processor may now let them interfere with each other. This can be resolved by re-naming the 
		 * class Processor extends Thread to class volatile Processor extends Thread. This makes it guaranteed to work on all processors.*/

class Processor extends Thread {
	private boolean running = true;

	@Override
	public void run() {
		/*
		 * The problem occurs when we start to think about how to terminate a
		 * thread properly in the cases like the one given below We can do that
		 * by using Thread Interruptions but here we will do this by shared
		 * data.
		 */
		while (running) {
			System.out.println("Hello");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void shutDown() {
		running = false;
	}
}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Processor processor1 = new Processor();
		processor1.start();
		System.out.println("Press return to Stop..");
		scanner.nextLine();
		processor1.shutDown();

	}

}
