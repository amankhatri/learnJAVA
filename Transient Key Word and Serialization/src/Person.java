import java.io.Serializable;

/*Serialization means if we take an object and serialize it, 
 * we turn it into a binary form/data, if we 
 * deserialize data that would mean we change the data back from
 * binary to object. Here we would be looking 
 * at serializing the files which is what people 
 * usually mean. In this project we will serialize
 * a file. So we will take objects of the person class
 * and write it into a file and then we will see how to 
 * read them from the file and turn into objects.*/
/*Ref1. we do this :  class implements Serializable*/
public class Person implements Serializable {
	/**
	 * serialVersionUID  is an id which is used to de-serialize objects 
	 * which you have serialized. 
	 * something to try to understand this: 
	 * 1) run the Write Objects
	 * 2) change serialVersionUID = 4801633306273802062L to 3801633306273802062L;
	 * 3) run the ReadObjects.java . 
	 * an error pops up, so we can conclude that this serialidversion
	 * relates the reading object to writing objects and is unique the
	 * class you should read with should match the class you wrote with
	 * You should not serialize everything in the program like you should
	 * never serialize threads . you can prevent serializing by using 
	 * transient keyword like this: 	private transient int id;
	 *trasient keywords doens't let the id feild to be serialized so when you
	 *read or write object, this field would be always zero
	 */
	private static final long serialVersionUID = 4801633306273802062L;
	private transient int id;
	private String name;
	private static int count;
	
	/*when you readObjects you don't run constructors, you 
	 * just read the objects from the text file or bin file*/
	public Person() {
		System.out.println("Default Constructor");
	}
	public Person(int id, String name){
		this.id = id;
		this.name = name;
		System.out.println("Constructor with arguments");
	}
	/*Getter and setters are associated with count and count is
	 * static and static variables are associated with class hence
	 * the getters and the setters are also static methods - look into Write
	 * objects file - ref1*/
	/*it deosn't make sense to make static fields serialized because
	 * they don't belong to objects and hence would remain same for
	 * all objects.*/
	/**
	 * @return the count
	 */
	public static int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public static void setCount(int count) {
		Person.count = count;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	/*now since count is a class level field the count will always be zero*/
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "] Count is " + count;
	}
	
}


