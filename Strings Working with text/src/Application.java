
public class Application {
	public static void main(String[] args) {
	
		int myInt = 17;
		//string is a class and not a primitive data-type like int or char or double
		//So, String is a class which means its a type, for example in real life we have cats, but the word cats doesn't
		//refer to a perticular cat, its a general category and in same way we have "String" class that can hold general
		//text.
		//Here we have variable "text" which is not capable of holding strings but reffering to a thing of type string 
		//and "Hello" is an object or an instance of class string. 
		String text = "Hello";
		String blank = " ";
		String name = "Bob";
		//concatinating string
		String greatings = text + blank + name;
		System.out.println("Concatinated variable is Greetins :" + greatings);
		System.out.println("text + Blank + name : " + text + blank + name);
		// or I can just do this
		System.out.println("Hello" + " "  + "Bob");
	}
}
