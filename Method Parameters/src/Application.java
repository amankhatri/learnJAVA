class Robot{
	public void speak(String text)
	{
		System.out.println("text: "+ text );
	}
	public void jump(int height)
	{
		System.out.println("Jumping: " + height);
	}
	public void move(String direction, double distance)
	{
		System.out.println("Movind "+distance + " in " +direction +" direction.");
	}
}
public class Application {

	private static String test;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot sam = new Robot();
		sam.speak("Hi I am Sam");
		sam.jump(7);
		sam.move("West", 12.2);
		String greeting = "Hello There";
		sam.speak(greeting);
	}

}
