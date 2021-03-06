/*43 imp*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*We will use File object which represents a file independent of
		 * the platform*/
		File file1 = new File("test.txt");
		BufferedReader br = null;
		try {
			FileReader fr = new FileReader(file1);
			/*We want to process the characters of one line at a time 
			 * so we will use buffered Reader */
			/*Reads text from a character-input stream, buffering
			 * characters so as to provide for the efficient reading
			 *  of characters, arrays, and lines.*/
			/*In general, each read request made of a Reader causes a 
			 * corresponding read request to be made of the underlying 
			 * character or byte stream. It is therefore advisable to 
			 * wrap a BufferedReader around any Reader whose read() 
			 * operations may be costly, such as FileReaders and InputStreamReaders. 
			 * Remember to close bufferReader to prevent memory location
			 * closing buffered reader closes file reader to facilitate 
			 * the closing we will declare Buffered Reader at the top*/
			 br = new BufferedReader(fr);
			 String line;
			 try {
				while((line = br.readLine())!= null){
					System.out.println("Line : "+line);	
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Unable to Readfile");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File Not Found" + file1.toString());
		}
		/*This code with finally block will always work and it will
		 * be executed always and forever*/
		finally{
		try {
			/*if we don't set up br = null it would shut up*/
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to close file: " + file1.toString());
		}catch (NullPointerException ex){
			System.out.println("File was probably never opened");
		}
		}
		
		
	}

}
