import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1 = new File("test.txt");
		/*try with resources will close the file automatically*/
		/*The try-with-resources statement is a try statement 
		 *that declares one or more resources. A resource is
		 *an object that must be closed after the program is 
		 *finished with it. The try-with-resources statement
		 *ensures that each resource is closed at the end of
		 *the statement.*/
		try(BufferedWriter br = new BufferedWriter(new FileWriter(file1))){
			br.write("This is line one. ");
			br.write("This is line two");
			br.newLine();
			br.write("This is last line");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
