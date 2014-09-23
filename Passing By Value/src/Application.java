/*in java we have passing by value not by reference*/
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//******************************************
		Application application = new Application();
		/*when we declare primitive data type , the java allocates
		 * memory to store the primitive data type*/
		int value = 7;
		System.out.println("1. Value is: " +value);
		application.show(value);
		System.out.println("4. Value is: " +value);
		//******************************************
		/*Where as when we declare non primitive data type we are not
		 * creating enough memory to store Person("bob") insetead person
		 * person would store the address in some sense. Where
		 * as new Person("bob") part of the statement is acllocating 
		 * the data of the class */
		Person person = new Person("Bob");
		System.out.println("1. Person: " +person.toString());
		/*when we run application.show(person) we are copying the
		 * address of person and passing it to show(Person person),
		 * note: the address of show(Person person) is not equal to
		 * the address of person untill unless we pass it to application.show(Person person) */
		application.show(person);
		System.out.println("4. Person: " + person);
		
	}
	public void show(int value){
		System.out.println("2. Value is " +value);
		value = 8;
		System.out.println("3. Value is " +value);
	}
/*you can have same method name as long as they have different 
 * arguments*/
	/*person is non primitive Person type of variable which 
	 * is an object*/
	public void show(Person person){
		System.out.println(person.toString());
		/*Here we are using the address of person in
		 *  show(Person person) to store Mike, but this 
		 *  address is only valid in scope of this function.*/
		person = new Person("Mike");
		System.out.println("3. Person is: " + person);
	}
}
