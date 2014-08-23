
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Allocating memory for mach1 which is a machine*/
		Machine mach1 = new Machine();
		mach1.start();
		mach1.stop();
		Car car1 = new Car();
		/*Children can access all the methods of parents but vice 
		 * versa is not true see class Car.java in order to see how 
		 * to make an child class using inherentance*/
		mach1.start();
		car1.wipeWindShield();
		mach1.stop();
	/* Note if a class is a final class like String class, it can 
	 * not be extended	
	 */
		car1.start();
		
	}

}
