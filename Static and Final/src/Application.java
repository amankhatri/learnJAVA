class Thing {
	public String name;
	// Static variables only have one copy and it can only be accessed by the
	// class
	public static String description;
	// when you declare variable as final you can't reassign value to it.
	// you have to declare the value of final variable at the time you make the
	// variable:
	public static final int LUCKY_NUMBER = 7;
	// now we will create a constructor which counts the number of time it has
	// been
	// called
	public static int count = 0;
	// we want id to be unique for each object, now we will assign count to id
	// and we will
	// have unique id for each obj
	public int id;

	public Thing() {
		id = count;
		// every time we have new Thing() or we declare a new obj of type thing
		// the
		// count will increase.
		count++;
	}

	public void showName() {
		System.out.println("Object Id is: " + id);
		System.out.println("Name: " + name);
		// although description is a static method we can do this
		System.out.println("Description: " + description);
		// because the variable is local to the class thing. so instance method
		// can
		// access static data.
	}

	public void setDescription(String str) {
		description = str;
	}

	// declaring static method
	public static void showInfo() {
		System.out.println("Description: " + description);
		// This: System.out.println(name); wont work because its not static and
		// there
		// are two objects like thing1 and thing2 objects which are used to
		// declare it
		// and being static method , it cannot happen.
	}

}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Static variables can not be initialized using objects, they can only
		// be
		// called using the class name like this:
		Thing.description = "I am a thing";
		System.out.println("Thing.description: " + Thing.description);
		System.out.println("Before creating the object count is: "
				+ Thing.count);
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		System.out.println("After creating the objects count it: "
				+ Thing.count);
		// where are public variables can be set using objects and each
		// object gets a copy, These variables are instance variables, for
		// example "name"
		thing1.name = "Bob";
		thing2.name = "Sue";
		System.out.println("Thing1.name: " + thing1.name);
		System.out.println("Thing2.name: " + thing2.name);
		System.out.print("thing1.showName():");
		thing1.showName();
		thing2.showName();
		// calling static method
		System.out.print("Static method showinfo: ");
		Thing.showInfo();
		// we can access the Static variables using setters
		thing1.setDescription("In setter this is a thing");
		Thing.showInfo();
		// although you should try
		// example and question
		// make something similar to Class.variable which gives a constant and
		// you should not be able to access or reset the constant value
		System.out.println("Math.PI: " + Math.PI);
		// Solution
		System.out
				.println("Final Variable LUCKY_NUMBER: " + Thing.LUCKY_NUMBER);

	}

}
