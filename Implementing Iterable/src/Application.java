
public class Application {

	public static void main(String[] args) {
		/*we will create out own iterable class. */
		Urlibrary urLibrary = new Urlibrary();
		/*since Urlibrary class implements iterable over strings we would
		 * have to declare for loop as : for(type_of_variable name_of_Variable
		 * : name_of_object in this class)*/ 
		for(String html: urLibrary){
			System.out.println("html.length: "+html.length());
			System.out.println("URL: " +html);
		}
	}

}
