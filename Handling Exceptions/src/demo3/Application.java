package demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			openFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/*error here is thown out to openfile and there fore we need to handle
	 * the error in main*/
	public static void openFile() throws FileNotFoundException{
		File file = new File("test.txt");
		FileReader fr = new FileReader(file);
	}

}
