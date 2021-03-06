import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Default size is 10 */
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(100);
		arrayList.add(40);
		System.out.println("Iteration type: 1");
		for(int i=0;i<arrayList.size();i++){
			System.out.println(arrayList.get(i));
		}
		System.out.println("Iteration type: 2");
		/*type variable : the iteration array*/
		for(Integer value: arrayList){
			System.out.println(value);
		}
		/*removing the items from the begning is longer process
		 * than removing the items from the end of the arrayList*/
		arrayList.remove(2);
		System.out.println("Iteration type: 3");
		for(Integer value: arrayList){
			System.out.println(value);
		}
		//List Interface..
		/*List is just an interface so we are pointing the 
		 * list to the type of ArrayList, it can point to any
		 * sort of list link List or arraylist or whatever. 
		 * Remember Link List occupies more memory than array list.*/
		List<String> values = new ArrayList<String>();

	}

}
