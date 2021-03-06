/*You can create Abstract classes when you try to create
 * class haiarchy. However base class is gonna do nothing unless
 * you create methods inside it */
/*Now lets say if class Camera and Car has some common methods or variables,
 *  for example ID, we can create it in Machine class, which is the parent
 * or create an interface*/

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Camera cam1 = new Camera();
		cam1.setId(5);
		Car car1 = new Car();
		car1.setId(4);
		car1.run();
		/*Now if I think about it, I can say that there is Camera
		 * and a car which is type of machine but Machine itself is
		 * is a general thing which has to be something more specific, 
		 * not just an abstract. so we can prevent the use of Machine class
		 * heiarchy by declaring Machine class as abstract (refer 1 to machine class)*/
		/*now I won't be able to do Machine machine1 = new Machine() because machine
		 * is an abstract. Abstract classes can have abstract method. refer2 in class machine.*/
		
	}

}
