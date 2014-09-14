
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot robot = new Robot(7);
		robot.start();
		/*if Brain class is set to public type then we can do this:*/
		Robot.Brain brain = robot.new Brain();
		/*Robot.brain is a type here so we do what we do about*/
		Robot.Battery battery = new Robot.Battery();
		battery.charge();
		/*NOte that there is a difference between
		 *  Robot.Brain brain = robot.new Brain(); and 
		 *  Robot.Brain brain = robot.new Brain();
		 *  */
		
	}

}
