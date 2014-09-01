import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Application {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String filename = "C:\\Users\\khatri home\\Desktop\\example.txt";
		/*or you can do this: */
		String filename2 = "C:/Users/khatri home/Desktop/example.txt";
		File textFile = new File(filename);
		/*Reading a file in java requires classes like Reader and Buffer and other 
		 * classes. Sightly simple way to do it is to use Scanner Class*/
		Scanner in = new Scanner(textFile);
		/*Now we can read the data using several methods in file*/
		while(in.hasNextLine())
		{
			String line = in.nextLine();
			System.out.println("Line is : "+line);
		}
		/*when you open the scanner don't forget to close it*/
		in.close();
		/*Now we will read example.txt just for number of lines which 
		 * have been mentioned in the first line of example.txt*/
		File textfile2 = new File(filename2);
		Scanner in2 = new Scanner(textfile2);
		int value = in2.nextInt();
		in2.nextLine();
		System.out.println("Reading: "+value + " Lines");
		int count = 0;
		while(count < value){
			String line2 = in2.nextLine();
			System.out.println("Line Number: "+count +" is: "+ line2);
			count++;
		}
		/*now as we can see that Line 0 is a blank line where as there is no 
		 * blank line which is visible to us. The reason is there is an invisible 
		 * char which nextInt doesn't read but but nextLine, the blank char is
		 * called newLineChar */

		
	}

}
