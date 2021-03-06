import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*This writes objects to the file*/
public class WriteObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Writing Objects ..");
		try(FileOutputStream fs = new FileOutputStream("people.bin");ObjectOutputStream os = new ObjectOutputStream(fs)){
			
			Person person = new Person(7, "Bob");
			/*Ref1:now since set count is a static method you can
			 * not do person.setCount(); since static methods belong to 
			 * class and not the the object. Hence you have to do
			 * this: Person.setCount(88);*/
			Person.setCount(88);
			os.writeObject(person);
			
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
