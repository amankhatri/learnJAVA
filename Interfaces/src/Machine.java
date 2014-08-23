
/*when you write implements info in just like this: */
public class Machine implements Info, IStartable {
	private int id = 7;
	public void start(){
		System.out.println("Machine Started");
	}
	
@Override
	public void stop() {
		// TODO Auto-generated method stub
	System.out.println("Machine Stopped");
	}

	/*You can overide the functions you have declared in interfaces*/
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Machine Id: " +id);
	}
	
}
