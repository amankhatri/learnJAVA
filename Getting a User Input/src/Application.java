import java.util.Scanner;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//scanner is the class and input is the arbitrary variable name which refers to an object of type scanner
		Scanner input = new Scanner(System.in);
		//output prompt
		System.out.println("Enter a line");
		//wait for user to press enter and/or enter the input
		String line =  input.nextLine();
		//print line
		System.out.println("You entered "+ line);
		// now we want user to enter integer only 
		int integer = input.nextInt();
		System.out.println("Enter a Integer");
		System.out.println("The next Intger is: "+ integer);
	}

}
