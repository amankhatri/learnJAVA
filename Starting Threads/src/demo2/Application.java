package demo2;
/*The second method to implement thread is to implement
 * runnable and pass it to the constructor of the thread
 *  class*/
class Runner implements Runnable{
	/*Runnable is an interface with just one method in it
	 * */
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

}
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Create an object of thread class and pass 
		 * a instance of runner class here to the 
		 * constructor*/
		Thread t1 = new Thread(new Runner());
		Thread t2 = new Thread(new Runner());
		/*Now I have to start both the codes*/
		t1.start();
		t2.start();
/*Sometimes you just want to run one method in separate
 * thread and it is a hassle to implement individual method 
 * in individual classes. look in package demo3 for more */
	}

}
