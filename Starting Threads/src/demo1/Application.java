package demo1;
/*There are two ways of starting a thread in java
 * and each thread in java is a separate process which
 * can run concorently with other threads. The first way
 * of starting a thread in java is to extend the Thread
 * class*/
/*First method in demo1 */
class Runner extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			System.out.println("Hello "+ i);
			/*To simulate a real process I will slow 
			 * down the speed of this loop a little bit
			 * by using static method sleep*/
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	/*Thread class has a method Run and I want to override
	 * that method*/
	
}
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner runner1 = new Runner();
		/*if I call run it will certainly run my code but
		 * it will run in the main thread of the application
		 * if I call start, that asks the Thread method to
		 * go look for run method and to run that in its own
		 * special thread*/
		runner1.start();
		/*To prove that this is a multi-threaded application
		 * we can have runner 2 and call the start method*/
		Runner runner2 = new Runner();
		runner2.start();

		
	}

}
/*Second method in Demo2*/


