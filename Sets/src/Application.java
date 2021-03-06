import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*Set is kind of collection which stores only unique elements. We can also have a set of
 * custom objects or as keys in a map. we will learn basic operations on sets like
 * intersection and iterating through a set. */
public class Application {

	public static void main(String[] args) {
		// HashSet does not retain order. Hashset can and will rearrange themself in some 
		// random logical order
		System.out.println("HashSet- random sort");
		Set<String> stringSet = new HashSet<String>();
		stringSet.add("Dog");
		stringSet.add("Cat");
		stringSet.add("Mouse");
		stringSet.add("Snake");
		stringSet.add("Bear");
		System.out.println(stringSet);
		/*Adding duplicate items - Since Sets can only have unique item , adding a duplicate
		*would have no effect
		*/
		stringSet.add("Mouse");
		System.out.println(stringSet);
		System.out.println("-----------------------------------------------------------\n");
		/*if we want a set to have a certain type of order we would have to use Linkedhasset
		 * retains the order in which they were added in.*/
		System.out.println("LinkedHashSet-sorts in the order in which it was entered");
		Set<String> LinkedstringSet = new LinkedHashSet<String>();
		LinkedstringSet.add("Dog");
		LinkedstringSet.add("Cat");
		LinkedstringSet.add("Mouse");
		LinkedstringSet.add("Snake");
		LinkedstringSet.add("Bear");
		System.out.println(LinkedstringSet);
		/*Adding duplicate items - Since Sets can only have unique item , adding a duplicate
		*would have no effect
		*/
		LinkedstringSet.add("Mouse");
		System.out.println(LinkedstringSet);
		System.out.println("-----------------------------------------------------------\n");
		System.out.println("TreeSet- orders in natural order");
		Set<String> treeStringSet = new TreeSet<String>();
		treeStringSet.add("Dog");
		treeStringSet.add("Cat");
		treeStringSet.add("Mouse");
		treeStringSet.add("Snake");
		treeStringSet.add("Bear");
		System.out.println(treeStringSet);
		/*Adding duplicate items - Since Sets can only have unique item , adding a duplicate
		*would have no effect
		*/
		LinkedstringSet.add("Mouse");
		System.out.println(treeStringSet);
		System.out.println("-----------------------------------------------------------\n");
		/*Iterating through a set using for each loop*/
		/*for(type_of_variable_I_am_iterating_through(string,int,double,key,value) variable_name:
		 * name_of_object_i_am_iterating_through){sysout(variable_name)}*/
		System.out.println("Iteration");
		for(String element: stringSet){
			System.out.println("Element: " +element);
		}
		/*Does set contain a given item? if it is perticular kind of llist you have to
		 * iterate though it to find the element but set are optimized to find perticular
		 * item*/
		System.out.println("-----------------------------------------------------------\n");
		if(stringSet.contains("Fox")){
			System.out.println("Contains Fox");
		}
		else if(stringSet.contains("Cat")){
			System.out.println("Contains Cat");
		}
		else if(stringSet.contains(" ")){
			System.out.println("Contains Blank");
		}
		else {
			
		}
		/*Intersection*/	
		System.out.println("TreeSet- orders in natural order. Demonstration of intersection");
		Set<String> treeStringSet2 = new TreeSet<String>();
		treeStringSet2.add("Dog");
		treeStringSet2.add("Cat");
		treeStringSet2.add("Giraffe");
		treeStringSet2.add("Monkey");
		treeStringSet2.add("ant");
		System.out.println(treeStringSet2);
		/*Hashset is the lightest set to use*/
		/*The statement below will make intersection a copy of treeStringSet*/
		Set<String> intersection = new HashSet<String>(treeStringSet);
		System.out.println("Copied treeStringSet in intersection");
		System.out.println(intersection);
		/*now lets see what is common in treeStringSet/intersection and treeStringSet2.
		 * running intersection.retainAll will only keep the elements in intersection which
		 * are common to treeStringSet and treeStringSet2*/
		intersection.retainAll(treeStringSet2);
		System.out.println("After running intersection.retainAll: ");
		System.out.println(intersection);
		
		/*we can all find different in sets */
		System.out.println("Demonstrating difference in treeStringSet and treeStringSet2 ");
		/*finding elements in treeStringSet which are not in treeStringSet2*/
		Set<String> difference = new HashSet<String>(treeStringSet);
		/*so I will basically remove all the elements of treeStringSet2 from difference*/
		difference.removeAll(treeStringSet2);
		System.out.println("After running difference.removeAll(treeStringSet2);: ");
		System.out.println(difference);
		
		
		
	}

}
