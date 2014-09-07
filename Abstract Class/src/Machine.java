
/*Abstract refer1 */
public abstract class Machine {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	/*Refer 2 : Every machine is going to have a different 
	 * sort of start because Camera would start when it turns on 
	 * the Display, where as car would start when its engine start.
	 * This is appropriate to have all child classes of Machine (Camera,
	 * and car) implement it but not the class Machine. Now this is
	 * similar to an interface and I got to implement it in child classes. 
	 * However by making Machine a abstract class we are Giving child classes
	 * a very rigid definition. Remember interface can be implemented by any class
	 * by machine or by a person anything or any class where as abstract classes 
	 * and methods can be implemented by child classes only*/
	public abstract void start();
	public abstract void doStuff();
	public abstract void shutDown();
	/*Now lets say ever machine has run method: */
	public void run(){/*Method Implemented in Application class*/
		/*Now here I can call start method */
		start();
		doStuff();
		shutDown();
		
	}
	
}
