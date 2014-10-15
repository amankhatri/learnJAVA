package demo3;
/*Sometimes you just want to run one method in separate
* thread and it is a hassle to implement individual method 
* in individual classes. This can be done using anonymous
* classes*/
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Runnable(){

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
			
		});
		t1.start();	
	

	}
	/*There is another way to start a thread using executable
	 * services if you want your thread to be in thread pool. More*/
	 
	
}

