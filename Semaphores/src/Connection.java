import java.util.concurrent.Semaphore;

/*Making this a singleton class that means the constructor will be private*/
public class Connection {
	private static Connection instance = new Connection();
	private Semaphore sem = new Semaphore(10,true); // to limit the number of connections
	private int connections = 0;
	private Connection(){
		
	}
	/**/
	public void connect(){
		try {
			sem.acquire();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try{
			doConnect();
			
		}finally{
			sem.release();
		}
		
	}
	public static Connection getInstance(){
		return instance;
	}
	
	/*so if I uncomment everything here and run the code i would not be able to see the execption thrown by thread.sleep and that would result in
	 * never releasing semaphore that is why i create a connect method above*/
	public void doConnect(){
//		try {
//			sem.acquire();
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		synchronized(this){
			connections++;
			System.out.println("Current Connections: " +connections );
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized(this){
			connections--;
		}
//		sem.release();
	}

}
