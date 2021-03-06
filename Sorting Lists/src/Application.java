import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*How to sort list using comparators
 * It can also be used for any classes.*/
class StringLengthComparator implements Comparator<String>{
//ref1
	@Override
	public int compare(String s1, String s2) {
		// This method compares two object from your list and tells which one
		//is greater 
		/*So if s1>s2 returns 1
		 * if s2>s1 returns -1
		 * if s2==s1 returns 0*/
		int len1 = s1.length();
		int len2 = s2.length();
		if(len1>len2){
			return 1;
		}
		else if(len2>len1){
			return -1;
		}
		else {
			return 0;
		}
	}
	
}
class AlphabeticalComparator implements Comparator<String>{
	//we are sorting in alphabetical order 
		@Override
		public int compare(String s1, String s2) {
			
			return -s1.compareTo(s2);
			/*Returns the minimum element of the given collection, according
			* to the natural ordering of its elements. All elements in the 
			* collection must implement the Comparable interface. Furthermore, 
			* all elements in the collection must be mutually comparable 
			* (that is, e1.compareTo(e2) must not throw a ClassCastException for 
			* any elements e1 and e2 in the collection).*/
			/*This is pretty much doing the same thing as StringLengthComaprator
			 * so if we change the signs of + to - of the returned it the alphabetical
			 * order will be reversed lets implement it: */
	}
}
class Person{
	private int id;
	private String name;
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	
	
	
}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*This works on all sorts of lists.*/
		List<String> animals = new ArrayList<String>();
		animals.add("Tiger");
		animals.add("Cat");
		animals.add("Elephant");
		animals.add("Lion");
		animals.add("Snake");
		animals.add("Mongoose");
		/*If I want to sort this list in an alphabetic order I can use a 
		 * static method called sort*/
		Collections.sort(animals);
		for(String animal: animals){
			System.out.println("Animal: "+animal );
		}
		/*Sorting with list of integers*/	
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(1);
		numbers.add(36);
		numbers.add(73);
		numbers.add(40);
		/*Collections.sort will sort the number in natural order.*/
		Collections.sort(numbers);
		Collections.sort(animals);
		for(Integer number: numbers){
			System.out.println("Number: "+number );
		}
		/*Suppose you want to sort the  list in some order, you have to
		 * make a new comparator interface. Let is suppose that we have 
		 * to sort animals in order of string length -- ref1*/
			/* now to sort the animals list according to string length
			 * we will do this */ 
		System.out.println("Sorting According to the String Length");
		Collections.sort(animals, new StringLengthComparator());
		for(String animal: animals){
			System.out.println("Animal: "+animal );
		}
		System.out.println("Reverse Alphabetical Order");
		Collections.sort(animals, new AlphabeticalComparator());
		for(String animal: animals){
			System.out.println("Animal: "+animal );
		}
		System.out.println("Sorting Numbers using Annonymous Class.");
		/*Ananonymous Class implementation. We can also do it be using interfaces
		 * like we did for alphabets and StringLengthComparator*/
		Collections.sort(numbers, new Comparator<Integer>(){

			@Override
			public int compare(Integer num1, Integer num2) {
				// TODO Auto-generated method stub
				/*we can do this by implementing it in a long way as 
				 * we did in StringLengthComparator */
				return -num1.compareTo(num2);
			}
			
		});
		for(Integer number: numbers){
			System.out.println("Number: "+number );
		}
	
		System.out.println("Sorting Persons by ID ");
		List<Person> people = new ArrayList<Person>();
		people.add(new Person(3,"Bob"));
		people.add(new Person(1,"Joe"));
		people.add(new Person(2,"Sue"));
		people.add(new Person(4,"Claire"));
		System.out.println("Unsorted List: ");
		for(Person person: people){
			System.out.println("Person: " +person);
		}
		/*Collections.sort(people); This won't work because collections.sort
		 * do not accept objects as parameters so we do this:*/
		Collections.sort(people, new Comparator<Person>() {
			/*if I have to sort it using id I could wrap my id in integer*/
			@Override
			public int compare(Person p1, Person p2) {
				// TODO Auto-generated method stub
				int id1 = (p1.getId());
				int id2 = (p2.getId());
				if(id1>id2){
					return 1;
				}
				else if(id2>id1){
					return -1;
				}
				else {
					return 0;
				}
				
				
			}
			
		});
		
		System.out.println("Sorted List By Id: ");
		for(Person person: people){
			System.out.println("Person: " +person);
		}
		Collections.sort(people,new Comparator<Person>(){

			@Override
			public int compare(Person p1, Person p2) {
				// TODO Auto-generated method stub
				return p1.getName().compareTo(p2.getName());
			}
			
		});
		System.out.println("Sorted List By Number: ");
		for(Person person: people){
			System.out.println("Person: " +person);
		}
	}

}
