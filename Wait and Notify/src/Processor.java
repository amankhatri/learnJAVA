import java.util.Scanner;



public class Processor {
	public void produce() throws InterruptedException{
		/*This here refers to Processor , i.e processor object*/
		synchronized(this){
			System.out.println("Producer Thread Running...");
			/*Causes the current thread to wait until another thread invokes the notify()
			 *  method or the notifyAll() method for this object. In other words, this method 
			 *  behaves exactly as if it simply performs the call wait(0). Wait should always be inside synchronized method. 
			 *  synchronized code block will loose the control over whatever is inside it and wait will take control over it and the
			 *  thread will not execute until two of the given conditions are fulfilled
			 *  for synchronized to get control of the thread again from wait , it must be resumed. and another thing
			 *  is that I should call a method called notify in another method on the processor object (this object)*/
			wait();
			/*After this wait() the main executes the next part of code in main file*/
			System.out.println("Resumed. ");
		}
	}
	public void consumer() throws InterruptedException{
		Scanner scanner = new Scanner(System.in);
		Thread.sleep(2000);
		synchronized(this){
			System.out.println("Waiting for return key");
			scanner.nextLine();
			System.out.println("Return Key Pressed.. ");
			/*since notify is working on same object (synchronized this) it will notify the thread which are waiting on the same block of code for
			 * which this object is synchronized*/
			notify();
			/*After calling notify the code in this block will be completed and then the control will be given back to the method where wait was called
			 * in this case producer.*/
		}
	}

}
