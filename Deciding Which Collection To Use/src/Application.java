import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*ConsiderL
		 * 1. What you need the collection to do
		 * 2. are you using the fastest collection for your purposes
		 * (think about insertion/deletion, retrieval and traversal
		 * */
		//////////////////////Lists//////////////////////////////
//		store lists of objects
//		duplicates are allowed
//		objects remain in order in which you add them in. And if you want you can sort the objects seperatly
//		elements are indexed via an integer 
//		checking for particular item in list is slow
//		looking an item up by index is fast
//		iterating though lists is relatively fast
//		note: you can sort lists if you want to.
//		
//		if you only add or remove items at end of list, use ArrayList.
		List<String> list1 = new ArrayList<String>();
		
//		removing or adding items elsewhere in the list use LinkedList
		List<String> list2 = new LinkedList<String>();
		
		
		///////////////////Sets///////////////////////////////////
//		only store unique values
//		great for removing duplicates
//		not indexed, unlike lists
//		very fast to check if a particular object exists
//		if you want to use your own objects, you must implement hastCode() and equals()
//		
//		order is unimportant and ok if it changes (random order)?
//		Hash is not ordered.
		Set<String> set1 = new HashSet<String>();
		
//		sorted in natural order? use TreeSet you have to implement comparable interface to custom order them
//		(1,2,3,4,......a,b,c,d.... etc). uses trees to maintain order
		Set<String> set2 = new TreeSet<String>();
		
//		Element remain in order they were added, uses linked list to maintain order
		Set<String> set3 = new LinkedHashSet<String>();
		
		//////////////////Maps/////////////////////////////////////
//		key value pairs.
//		like lookup tables
//		Retrieving a value by key is fast and iterating though map keys is very fast
//		maps are not really optimized for iteration
//		iterating over map values is very slow
//		if you want to use your own objects as keys, you must implement hashcode() and equals()
		
//		keys not in any particular oder, and order liable to change.
		Map<String,String> map1 = new HashMap<String, String>();
		
//		keys sorted in natural order implement comparable interface to custom order them
		Map<String, String> map2 = new TreeMap<String, String>();	
		
//		keys remain in order added 
		Map<String, String> map3 = new LinkedHashMap<String, String>();
		
//		there are also sortedset and sortedmap interfaces.
	}

}
