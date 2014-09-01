import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*Exceptions*/
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("text.txt");
		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); //top line of the error tells us what are we dealing with
			/*And last line is usually the line number where error occurs. so the above line
			 * is not important but it is usually helpful to put it there. */
			System.out.println("File not Found");
		}
		
		
	}

}
