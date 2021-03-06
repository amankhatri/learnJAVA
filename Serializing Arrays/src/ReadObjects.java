import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

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
			/*when we read object using (Person[])oi.readObject();, 
			 * the java can check if (Person[]) is write type of cast
			 * or not. */
			Person[] people = (Person[])oi.readObject();
			/*with parameterized classes in geenral the classes that
			 * takes classes in between the dimonds <> ArrayList<Person> peopleList 
			 * the type i.e person in this case, gets eroded while compilation 
			 * so if you don't suppress the warring as i am doing it will always
			 * */
			
			@SuppressWarnings("unchecked")
			ArrayList<Person> peopleList = (ArrayList<Person>)oi.readObject();
	
			/*look at this fancy type of loop*/
			for(Person person: people){
				System.out.println(person);
			}
			/**/
			for(Person person: peopleList){
				System.out.println(person);
			}
			int num = oi.read();
			for(int i =0;i<num;i++){
				Person person = (Person)oi.readObject();
				System.out.println(person);
			}
			
			oi.close();
	
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
