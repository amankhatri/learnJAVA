import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;


public class Test {
	public void run() throws IOException, ParseException{
		//throw new IOException();
		/*now lets say we want to throw another exception we do this:
		 * as you can see, the method keeps on extending initially it was
		 * public void run() throws IOException and now it is : public void run() throws IOException, ParseException*/
		throw new ParseException("Error in Commant list.",2);
	}
	/*first reference here:*/
	public void input() throws IOException,FileNotFoundException{
		
	}
	
}
