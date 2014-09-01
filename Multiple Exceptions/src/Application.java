import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		/*
		 * try { test.run(); } catch (IOException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); } catch (ParseException e) { // TODO
		 * Auto-generated catch block e.printStackTrace();
		 * System.out.println("Couldn't parse command file."); }
		 */
		// or we can do this
		/*
		 * try { test.run(); } catch (IOException | ParseException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		/*
		 * DUE TO property of poly morphism , we know that we can pass child
		 * class wherever parent class is expected so we can do this:
		 */
		try {
			test.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*that is we can change IOException or ParseException to just exception
		 * and java would catch any exception since Exception is the parent class
		 * Refer to class Test.java*/
		try {
			test.input();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*Remember above we have to have file not found exception first because 
		 * java runs up to down and if java doesn't find file and we have IOException 
		 * prior to FileNotFoundException, java will show I/O exception*/
	}
}

