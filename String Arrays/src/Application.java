
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*arrays of strings*/
		String[] words = new String[3];
		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";
		System.out.println(words[2]);
		/*Everything I did above can be done in one line below:*/
		String[] fruits = {"apple","banana","pear","kiwi"};
		//now we will printout everything in fruits array using for loop
		/*New format to declare for loop first create a variable of type string then to 
		 * iterate that variable until the end of fruits variable you do something like this:*/
		for(String iterate: fruits) //now java will set variable "iterate" to each element refered by fruits
		{
			System.out.println("Fruits: " + iterate);
		}
		
		int value = 0; //enough memory to hold 32 bit value.
		/*This is non primitive and hence begins with capital letter name of the class String*/
		/*test is a type of string and refers to a memory location of the string*/
		String text = null; //null is default value of reference for String type and null refers to nothing
		System.out.println("Text: "+text);
		String[] texts = new String[2]; //variable "texts" refers to a memory location where two Strings types are saved
		System.out.println("String[0]: " + texts[0]);
		//initialize 1st element to "one"
		texts[1] = "one";
		System.out.println("String[1]: "+ texts[1]);
	}

}
