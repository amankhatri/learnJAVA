import java.util.HashMap;
import java.util.Map;

/*Most common type of map*/
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*maps store pairs. In a pair we have a value and a key. When we create the map 
		 * we have to specify which kind of object we want to store in it.*/
		/*For example here we are storing strings which are keyed by integers
		 * Hash map is not sorted in any perticular way, it is not nessasary that
		 * key 1 would be the first object in hash map. So when we run this program
		 * it will give us different sequence each time.*/
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		/*Adding a key & value by using map.put. We can look up the values
		 * using the key*/
		map.put(5, "Five");
		map.put(4, "Four");
		map.put(3, "Three");
		map.put(2, "Two");
		map.put(1, "One");
		String text = map.get(4);
		System.out.println("Value is: " +text);
		/*When you put another value for same key, the previous values
		 * gets over-written*/
		map.put(5, "re-inserting a value in the key 5");
		System.out.println("map.get(5): " +map.get(5));
		/*Looping through the map using for each loop. we are doing this using
		 * a MAP.Entry interface. you do for(Map.Entry<key,value> declareObject: 
		 * itteratethoughObject.entryset();*/
		for(Map.Entry<Integer, String> entry: map.entrySet()){
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key: "+key+ " Value: "+value);
		}
		

	}

}
