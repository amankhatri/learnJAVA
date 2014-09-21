import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ReadObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Reading Objects ..");
		try(FileInputStream fi = new FileInputStream("people.bin")){
			ObjectInputStream oi = new ObjectInputStream(fi);
			Person person = (Person)oi.readObject();
			System.out.println(person);
	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
