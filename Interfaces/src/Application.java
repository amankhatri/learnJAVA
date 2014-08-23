/*When you open a bank account you will look into serveral banks
 * and the features they provide, all banks would have certain common things
 * like they would allow you to withdraw money or deposit money*/
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine mach1 = new Machine();
		mach1.start();
		
		Person person1 = new Person("Bob");
		person1.greet();
		/* Now I want a method called show info in the 
		 * class machine and person now java gives me power to do 
		 * this even though machine and person classes are seperate*/
		/*Refer to info.java class now*/
		/*here is a variable of type info but it can only be used to talk 
		 * to method declared in Info using machine*/
		Info info1 = new Machine();
		info1.showInfo();
		/*point info2 to same location where person1 points at*/
		Info info2 = person1;
		info2.showInfo();
		System.out.println("New way to use interface: ");
		outputInfo(mach1);
		outputInfo(person1);
	
	}
	private static void outputInfo(Info info){
		info.showInfo();
	}
}
