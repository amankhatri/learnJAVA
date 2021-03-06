import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*Sorted Map, the sort interface in java*/
/*REMEMBER : ALL THE COLLECTIONS, THAT IS ONLY COLLECTION CLASSES, ARE ORGANIZED 
 * THOUGH INTERFACES. MAIN THREE COLLECTION CLASSES ARE: Lists, Map and Set interface*/
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Hash Map doesn't keep our keys in any type of order, and if we want to
		 * keey keys in order we have two choices use 1) Linked Hash Map and 2) Tree Map*/
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		/*Linked hash map is basically same as hash map except the fact that it has double
		 * linked list connecting the hash maps. That means your keys and values stay
		 * in the same order as you add them to the map.*/
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		/*Tree is basic structures in computing and tree sorts the value that you add to it
		 * usually in natural order ( natural orders for int is 1 2 3 4 5 ..) , we will
		 * study more in future. */
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		System.out.println("Hash Map: \n");
		testMap(hashMap);
		System.out.println("____________________________________________________\n");
		System.out.println("Linked Hash Map: \n");
		testMap(linkedHashMap);
		System.out.println("____________________________________________________\n");
		System.out.println("Tree Map: \n");
		testMap(treeMap);
		System.out.println("____________________________________________________\n");
		
		
	}
	/*Since they are using map interface you can pass them in a method by using map 
	 * interface like this:*/
	public static void testMap(Map<Integer, String> map){
		map.put(9, "Fox");
		map.put(4, "Cat");
		map.put(8, "Dog");
		map.put(1, "Giraffe");
		map.put(0, "Swan");
		map.put(15, "Bird");
		map.put(6, "Snake");
		/*Iterating through maps special loop. You can iterate over the keys and get the values
		 * map.keySet() returns a collection called a set which can iterate over set.*/
		for(Integer key : map.keySet()){
			String value = map.get(key);
			System.out.println("Key: " +key + " Value: " + value);
		}
		
		
	}

}
