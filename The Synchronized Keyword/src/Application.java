
public class Application {
	private int count = 0;
	public synchronized void increment(){
		count ++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application app = new Application();
		app.doWork();

	}

	public void doWork() {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10000; i++) {
					increment();
				}

			}

		});
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10000; i++) {
					increment();
				}

			}
			
		});
		/*t1.start();
		t2.start();
		System.out.println("Count is " +count);
		Now if I just type that it will give count = 0; because t1.start() and t2.start() starts their executing the code by the time 
		it reaches System.out.println("Count is " +count); so we would have to wait for these threads to complete processing and then print. To do that
		we use a method called t1.join and t2.join. Which will wait for thread t1 to finish and then t2 to finish. However both threads are not synchronized
		and both thread reads whatever value of count does other thread stores in the variable, for example if t1 store 100 in count t2 reads that, and vice
		versa. We need to make sure that just one thread uses a variable at a time. So we make declare count as atomic variable
		and make it synchronized by  using synchronized key word. What it does is:
		Every object in java has an intrinsic lock or a monitor lock, if you call synchronized keyword you have to acquire the method or the variable
		on which you use the keyword synchronized will be locked until one of the threads have completed processing it. if we declare something in 
		synchronized block we won't have to worry about volatile keyword */
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Count is " +count);
	}

}
