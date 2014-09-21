import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*first read the explaination in person.java class. This program
 * reads the object from the file */
/* reading and writing is both included in the program and
 * we are using two manin methods, which makes it two seperate programs*/
/*NOTE IN JAVA YOU CAN HAVE MORE THAN ONE MAIN METHODS BUT WHEN YOU RUN IT
 * YOU HAVE TO PICK ONE OF THE SEVERAL CLASSES WITH MAIN METHOD*/
public class ReadObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Reading Objects ..");
		try(FileInputStream fi = new FileInputStream("people.bin")){
			ObjectInputStream oi = new ObjectInputStream(fi);
			/*since reading oi would return an object we have to
			 * store it in type person*/
			Person person1 = (Person)oi.readObject();
			Person person2 = (Person)oi.readObject();
			oi.close();
			System.out.println(person1);
			System.out.println(person2);
			
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
