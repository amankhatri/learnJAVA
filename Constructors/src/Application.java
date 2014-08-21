class Machine {
	// name of constructor has to be same as name of the class.
	// Constructors are used to initialize the instance variable.
	private String name;
	private int code;

	public Machine() {
		this("Annie", 0); // so if we are calling another constructor from
							// within this construct , we would have to use this
							// and the call to constructor
		// should occur in the first line inside another constructor
		System.out.println("First Constructor Running");
		// as I know that creating a new instance of machine always runs
		// constructor automatically the variable name would always be
		// initialized to "Annie"
		name = "Annie";
	}

	// there can be more than one constructor with same name but they should
	// have different variables or number of variables which should be passed
	// into them
	// java will figure out what constructor are we calling based on the number
	// of parameters
	public Machine(String name) {
		this(); // calling constructor with no parameters required
		this.name = name; // this.name is instance variable and name is the
							// local variable of this constuctor
		System.out.println("Second Constructor Running");
	}

	public Machine(String name, int code) {
		this.name = name;
		this.code = code;
		System.out.println("Third Constructor Running");
	}

}

public class Application {
	public static void main(String[] args) {
		// constructor method is a method which runs every time you create an
		// instance of a class
		/* lets create a instance of class machine */
		Machine machine1 = new Machine(); // new Machine() is important to
											// create an instance of Machine
											// class
		// now I will make a public method in class machine with no return type
		// such a method is called constructor
		// new Machine runs the constructor if I run the code even if we don't
		// call that constructor
		// Constructors are used to initialize the instance variable.
		Machine machine2 = new Machine("Bertie");
		Machine machine3 = new Machine("Chalky", 7);
		// constructors can be called inside a constructors.
	}
}