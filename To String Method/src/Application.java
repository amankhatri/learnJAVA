class Frog1 {
	
}
class Frog{
	private int id;
	private String name;
	public Frog(String name, int id){
		this.name = name;
		this.id = id;
	}
	public String  toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("id: ").append(id).append(" Name: ").append(name);
		return sb.toString();
				
	}
	public String str(){
		return "end";
	}
}
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*All objects in java in java have Object class as its parent*/
		/*We will look into some standard objects in java*/
		// object is the superclass or the parent of all the classes we make
		Object obj = new Object();
		//Here I have a class Frog , and when you do :
		Frog1 frog = new Frog1();
		//frog.method , the methods would be the same as you get from 
		//obj.method
		//now we will learn about tostring method which is very useful in debugging
		Frog frog1 = new Frog("Freddy", 7);
		// when we have toString method defined for a class the line below displays what
		//ever is the return value of toString function of the class.
		System.out.println(frog1);
		// how ever when you don't have anything in the class frog, 
		// frog1 would something that looks like memory location (Frog@1db9742) or the 
		//which is a hash code, i.e unique identifier for all the objects
		
	   	
	}

}
