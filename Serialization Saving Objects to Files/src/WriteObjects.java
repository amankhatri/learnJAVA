import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*This writes objects to the file*/
public class WriteObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Writing Objects ..");
		Person mike = new Person(543, "Mike");
		Person sue = new Person(123, "Sue");
		System.out.println(mike);
		System.out.println(sue);
		//write the objects in a binary file.
		/*Whatever I did here to catch the exception is called try with
		 * resources. so try would automatically call the close method of 
		 * fs object*/
		try(FileOutputStream fs = new FileOutputStream("people.bin")){
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(mike);
			os.writeObject(sue);
			/*now we have to make the class person serializable ref1 look in
			 * person .java*/
			/*here I have to close os.close. we can do nested exceptions but
			 * it just mkaes the code ugly.*/
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
