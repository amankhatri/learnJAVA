/*There are two basic types of Exceptions: Checked Exceptions and Runtime
 * Exceptions. We have already dealt with Checked Exceptions in File Handeling
 * these types of exceptions are mandatory to be adressed as program can't run with 
 * them. Where as Run time exceptions  occurs while running the program */
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Example of Runtime Exception: */
		int value =7;
		String text = null;
		String[] texts = {"one", "two" , "three"};
		try {
			value = value/0;
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			System.out.println(text.length());	
		}catch (Exception e){
			System.out.println("Null Pointer");
			e.printStackTrace();
		}
		try{
			System.out.println("Text[3]: "+ texts[3]);
		} catch (RuntimeException e ){
			System.out.println(e.toString());
		}
		
		
	}

}
