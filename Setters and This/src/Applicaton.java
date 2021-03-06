class Frog {
	private String name;
	private int age;
	private int height;
	//setter method to set the name
	public void setName(String newName)
	{
		name = newName;
	}
	//setter method to set the age
	public void setAge(int newAge)
	{
		age = newAge;
	}
	//now here I am passing the height when I call the function, but this variable which I 
	//pass in the function is not same as the variable declared in line 4. While setting 
	//the variable height in line 4 (instance variable) in method setHeight I would have to do :
	public void setHeight(int height)
	{
		//here variable height refers to the closest height variable, that is in this case
		//the variable height which I am passing to the function setHeight. and to set it equal to
		//instance variable height I would have to do:
		this.height = height; //this.instance variable = local variable.
		//the word this is reference to the object you are in.
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public int getHeight(){
		return height;
	}
	
}

public class Applicaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//now to set variables we would have to create an object for the class frog
		// and we would have to know the names of the variables in the class like this:
		Frog frog1 = new Frog();
		//Name and age are instance variables from class Frog and showing your the names is 
		//not a good idea so we use setters to set instance variables
		//frog1.name = "Frog1";
		//frog1.age = 10;
		System.out.println("Frog1.name: "+frog1.getName());
		System.out.println("Frog1.age: "+frog1.getAge());
		//however knowing the names of the variables is not nessacary because we can use 
		//methods to set the variables of a class, these methods are called setters for example
		// see the two setters in class frog.
		frog1.setName("Frog2");
		frog1.setAge(18);
		frog1.setHeight(2);
		System.out.println("Frog Name: "+frog1.getName());
		System.out.println("Frog Age: "+frog1.getAge());
		System.out.println("Frog Height: "+frog1.getHeight());
		//Using setters encapsulates(hides) the instance variables from the main program so this is
		//called Encapsulation
		/*To enforce Encapsulation you declare the variables of class Frog as private*/
	}

}
