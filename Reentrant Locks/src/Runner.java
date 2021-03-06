import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Runner {
	private int count;
	/*I want to increment count to 20K, since both the thread will run separately. We can do this by using synchronized key word, however this can
	 * also be achieved by Reentrant lock. Always remember you have to unlock a thread as many times as you lock it. Ref1*/

	private Lock lock = new ReentrantLock();
	/*For Reentrant locks the equivalent of wait and notify(Remember every object in java has  wait and notify because it is defined in 
	* object class which is parent of all the classes in java).has are await and signal. These two methods are part of interface Condition. This is how we do it:
	* */
	private Condition cond = lock.newCondition();	//so we get the condition object from the lock you have creating. After this you can call lock.lock().
	/*Remember we have to lock the lock before waiting or notifying the objects*/
	private void increment(){
		for(int i = 0; i<10000;i++){
			count++;
		}
	}
	public void firstThread() throws InterruptedException {
		/*Ref: Here I will lock count via increment method and unlock it . Increment method will not be used by any other thread unless I unlock it. 
		 * However there may be scenario when the method in between locking and unlocking gives an exception and the code may be never get to unlock. 
		 * so to fix it we may have to do some error handling and  always remember to call finally block which is always guaranteed to be called. 
		 */
		lock.lock();
		cond.await();
		System.out.println("Woke up!");
		try{
			increment();
		}
		catch(Exception e){
			
		}
		finally{
			lock.unlock();
		}
		
	}
	public void secondThread()throws InterruptedException{
		Thread.sleep(1000);
		lock.lock();
		System.out.println("Press the return key");
		new Scanner(System.in).nextLine();
		System.out.println("Got the a returned key");
		cond.signal();
		try{
			increment();
		}
		catch(Exception e){
			
		}
		finally{
			lock.unlock();
		}
	}
	public void finished(){
		System.out.println("Count is : "+count);
	}
}
