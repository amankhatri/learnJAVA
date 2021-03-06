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
	 */
	private static final long serialVersionUID = 4801633306273802062L;
	private int id;
	private String name;
	public Person(int id, String name){
		this.id = id;
		this.name = name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
}
