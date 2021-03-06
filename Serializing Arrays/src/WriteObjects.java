import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/*This writes objects to the file*/
public class WriteObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Writing Objects ..");
		/*Array in java is simply an object and we can serialize it and
		 * deserialize it. Array of objects is serialization as long as
		 * objects in array are serializale. For example Person object is 
		 * searlizable.*/
		Person[] people = {new Person(1,"Sue"), new Person(99,"mike"),
				new Person(7,"Bob")};
		ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));
		try(FileOutputStream fs = new FileOutputStream("people.bin");ObjectOutputStream os = new ObjectOutputStream(fs)){
			
			System.out.println("Regular array");
			os.writeObject(people);
			System.out.println("Array List");
			os.writeObject(peopleList);
			/*read the size of peoplelist/ array list*/
			os.writeInt(peopleList.size());
			for(Person person: peopleList){
				os.writeObject(person);
			}
			/*we dont really need this because we are doing try with resources.*/
			os.close();
			
		} catch (FileNotFoundException e) {
			//if we can't create a file
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			//if we can't write  a file
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
