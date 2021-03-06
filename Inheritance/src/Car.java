
public class Car extends Machine{
	/*In this child class we can override the methods of parent class
	 * for example we will override the method start from Machine class*/
	@Override // checks if it really is an override
	public void start(){
		System.out.println("Car Started.");
	}
	/*Private methods are not visible to children*/
	/*public void showInfo(){
		System.out.println("Car Name: " + name);
	}*/
	/*Protected variables and others are visible to child class*/
	public void showReg(){
		/*It is not a good idea to override variables, 
		 * the results can be horrible*/
		System.out.println("Registration: " +registration);
	}
	public void wipeWindShield(){
		System.out.println("Wiping Wind Sheild");
	}

}
