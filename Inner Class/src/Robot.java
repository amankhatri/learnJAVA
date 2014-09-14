
public class Robot {
	
	private int id;
	/*I will now declare a class inside of class, this is also
	 * called nested class*/
	public class Brain{
		/*This non static class can now access all the non static 
		 * instance data
		 * of Robot class */
		public void think(){
			System.out.println("Robot " +id+ " is thinking.");
		}
		/*Non static classes are used at places where you want to 
		 * share the functionality and want the class to have access
		 * to the variable of the outter class*/
	}
	/*Second class of inner class is static type*/
	static class Battery{
		/*Since Battery is static type of class we can not access 
		 * the vaariable of the instances of class robot. */
		/*Are used where you want to group classes like Robot.Battery */
		public void charge(){
			System.out.println("Charging Battery");
		}
		
	}
/*constructor takes id and creates id*/
	public Robot(int id) {

		this.id = id;
	}
	public void start(){
		System.out.println("Starting " +id + " Robot.");
		/*I can also do this with nested classes: */
		Brain brain = new Brain();
		brain.think();
		final String name = "Robert";
		/*You can declare inner class anywhere */
		class Temp{
			/*Like Annonomous classes, if you have a method in an anonymous
			 * class you can refer to final data  */
			public void doSomething(){
				System.out.println("ID is: "+ id);
				System.out.println("My name is: " +name);
			}
		}
		Temp temp= new Temp();
		temp.doSomething();
		/*you can only refer to this class inside this method 
		 * and no where else. you can't make this class public or
		 * private or anything.*/
	}

}
/*There are few fancier ways to implement inner classes using 
 * iterator. This can iterate though the data of enclosing class.
 * if we want to learn more then look into interable interface   */
