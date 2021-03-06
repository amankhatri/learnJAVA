/*we can only have one public class in the entire code with main in it*/
/*we can have as many public classes as we want*/
/*class is a template for creating objects, everything in real world is an object*/
/*so there is a person class for example. class person represents a general type of person*/
class Person{
	//class should have:
	/*1) it will have data like name, age, etc which are instance variables.*/
	//using a private in front of a method or a variable would protect the variable from being accessed through the main method
	String name ;
	int age ;
	/*2) it can have subroutine or method which is used to model behavior of person*/
	void speak() // method name should be small letters to run this method we have to call this method from the class
	//remember constructor is not same as class.
	{
		System.out.println("My name is: "+name + " and I am "+age +"years old.");
	}

}
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Main is the subroutine or the method in class application
		/*Here we are creating a variable one, which is of type person*/
		Person person1 = new Person();
		person1.name="Joe Bloggs";
		person1.age = 37;
		person1.speak();
		Person person2 = new Person();
		person2.name = "Sarah Smith";
		person2.age = 20;
		person2.speak();
		System.out.printf("Person1.Name: %s, Person1.age: %d ",person1.name,person1.age);
		
	}

}
