import java.util.Scanner;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*we you ask the user to enter and wait until he enters an input*/
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int value = scanner.nextInt();
		while(value!=5)
		{
			System.out.println("Enter a number");
			value = scanner.nextInt();
		}
		System.out.println("got 5");*/
		/*Now we can do the thing which we have about using do while loop*/
		// now instead of writing this: Scanner input = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int value =0;
		do
		{
			value = input.nextInt();
		}
		while(value!=5);
		System.out.println("Got 5");
	}
		

}
