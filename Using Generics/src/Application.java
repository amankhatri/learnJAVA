import java.util.ArrayList;
import java.util.HashMap;
public class Animal{
	
}
/*Using Generic Classes*/
/*Generic Classes are the class that can work with objects by specifying 
 * what kind of objects it can be worked. */
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*using array list we don't have to worry about size of array or infact anything*/
		ArrayList list = new ArrayList();
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		/*Old method of accessing data*/
		String fruit = (String) list.get(2); //here we would have to downcast the list to type string
		System.out.println("Fruit: "+fruit);
		/*after introduction of generics probably in java 5, the classes
		 * were parameterized. For example generic allows us to do this: */
		ArrayList<String> strings = new ArrayList<String>(); //which means we can tell arraylist that it will contain string type objects
		strings.add("Cat");
		strings.add("Dogs");
		strings.add("Aligator");
		String animal = strings.get(1);
		System.out.println("Animal: "+animal);
		/*we can have parametrized classes with more than one type of object arguments example:*/
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		/*parameterization works with any kind of object, i.e you can make your own class
		 * and then pass the object to array list for example:  */
		ArrayList<Animal> someList = new ArrayList<Animal>();
		/*You can also write the above statement as :*/
		ArrayList<Animal> someList1 = new ArrayList<>(); //*keep diamonds empty:)
		
	}

}
