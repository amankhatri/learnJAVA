import java.util.ArrayList;

class Machine {

	@Override
	public String toString() {
		return "I am a Machine";
	}
	public void start(){
		System.out.println("Machine Started");
	}
	
}
class Camera extends Machine {

	@Override
	public String toString() {
		return "I am a Camera";
	}
	
}
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("One");
		list.add("Two");
		showList(list);
		ArrayList<Machine> machineList = new ArrayList<>();
		machineList.add(new Machine());
		machineList.add(new Machine());
		showMachineList(machineList);
		/*we cannot do this:machineList.add(new Camera()); since 
		 * ArrayList<Machine> is not subclass of ArrayList<Camera> */
		ArrayList<Camera> cameraList = new ArrayList<Camera>();		
		cameraList.add(new Camera());
		cameraList.add(new Camera());
		showCameraList(cameraList);
		/*weird things happening here please look into showExtendedList2 function*/
		showExtendedList2(cameraList);
		
	}
	/*since we don't have an object for class Application we will make Static method*/
	public static void showList(ArrayList<String> list){
		for(String value: list)
		{
			System.out.println("Value: " +value);
		}
	}

	public static void showMachineList(ArrayList<Machine> machinelist) {
		for (Object value : machinelist) {
			System.out.println("Value: " + value);
		}
	}

	public static void showCameraList(ArrayList<Camera> cameraList) {
		for (Object value : cameraList) {
			System.out.println("Value: " + value);
		}

	}
	/*? means ArrayList of unknown type and ? is called wildcard
	 * This means type arraylist of anytype to function, i.e camera or machine or strings*/
	public static void showUnknownList(ArrayList<?> unknownList){
		for (Object value : unknownList) {
			System.out.println("Value: " + value);
		}
	}
	//check this out:
	public static void showExtendedList(ArrayList<? extends Machine> unknownList){
		for (Machine value : unknownList) {
			System.out.println("Value: " + value);
			/*calling the function from Machine Class.*/
			value.start();
		}
	}
	/*we can also do this: */
	public static void showExtendedList2(ArrayList<? super Camera> unknownList){
		/*we would have to change type of Value from Machine to Object since
		 * it can take a camera value or a Machine value. */
		for (Object value : unknownList) {
			System.out.println("Value: " + value);
			/*calling the function from Machine Class.*/
		 ((Machine) value).start();
		}
	}
	/*So whatever I pass in above function can be a camera or super class of camera
	 * */

}
