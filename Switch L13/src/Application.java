import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a command");
		String text = scanner.nextLine();
		//case blocks has to be constant , like start is a constant type of text 
		switch (text) {
		case "start":
			System.out.println("Machine is now on");
			break;
		case "stop":
			System.out.println("Machine has stopped");
			break;
		default:
			System.out.println("Command not recognized");
			

		}
	}

}
