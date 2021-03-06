class Machine{
	public void start(){
		System.out.println("Machine Started");
	}
}
class Camera extends Machine{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Camera Started");
	}
	public void snap(){
		System.out.println("Photo Taken");
	}
	
}
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		machine1.start();
		camera1.start();
		camera1.snap();
		/*Upcasting is done with the variables 
		 * Machine will always we machine and camera will always be camera
		 * however you can change the variables of type so here we have
		 * casted camera1 to type machine */
		//Upcasting
		Machine machine2 = camera1;
		machine2.start();//this will invoke the start method to which machine2 will refer to
		/*so since machine2 refers to a camera it will call start method from Camera*/
		/*However I can not call machine2.snap() because we declare machine2 as a type of
		 * machine and it doesn't have snap method. However there is a way around it*/
		
		/*Downcasting*/
		Machine machine3 = new Camera();
		/*since machine3 is referring to camera this allows us to access the methods
		 * which are common to class machine and camera. how ever to access all the methods
		 * of class Camera we can do this: */
		Camera camera2 = (Camera)machine3;
		camera2.start();
		camera2.snap();
		/*now camera2 referes to machine3 and we can access the method snap using camera2*/
		/*java needs casting in downcasting because, downcasting is not safe*/
		Machine machine4 = new Machine();
		/*cant do this because actual object machine4 is machine and machine doesn't have
		 * everything that camera does.*/
		Camera camera3 = (Camera)machine4;//doesn't work this way
		camera3.start();
		/*you can't cast everything , forexample you cant cast machine to be a type of camera
		 * because it doesn't work.*/
	}

}
