/*class can implement as many interfaces as you want
 * */

public class Person implements Info{
	private String name;
	public Person(String name) {
		
		this.name = name;
	}

	public void greet(){
		System.out.println("Hello Pal");
		
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Person Name is: "+name);
		
	}
	
	
}
