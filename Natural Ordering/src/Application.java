import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
/*java.util.Collection; is different from java.util.Collections*/

class Person implements Comparable<Person>{
	private String name;

	public Person(String name) {
		super();
		this.name = name;
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
		return "Person [name=" + name + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Person person) {
		// Although the name is private is private I can access the name 
		/*in compareTo(person.name) because we are within the person class*/
		return name.compareTo(person.name);
	}
	
}
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		/*Tree sets organize elements of set in natural order. since this set
		 * will be sorted in natural order instead of using set interface 
		 * Set<String> set = new TreeSet<String>(); we will use sorted
		 * set interface like this: */
		SortedSet<String> set = new TreeSet<String>();
		/*if I want to pass a list or set*/
		System.out.println("Adding Elements to List");
		addElements(list);
		System.out.println("Adding Elements to Set");
		addElements(set);
		/*Since list is not sorted in any particular order : */
		System.out.println("Printing Unsorted Elements of List");
		showElements(list);
		/*Sorting List in particular order*/
		Collections.sort(list);
		/*Printing Sorted List*/
		System.out.println("Printing Sorted Elements of List");
		showElements(list);
		System.out.println("Printing Elements of Set");
		showElements(set);
		/*Sorting your own objects in natural order*/
		List<Person> peopleList = new ArrayList<Person>();
		SortedSet<Person> peopleSet = new TreeSet<Person>();
		System.out.println("Adding Person to List");
		addPeople(peopleList);
		System.out.println("Adding Person to Set");
		/*Since person class do not have a natural order you can not
		 * add people(addPeople(peopleSet);) in treeSet neither can 
		 * you call collection.sort on it. The way to fix this is 
		 * to make the class Person Implement Comparable interface
		 * class Person implements Comparable<thing you want to compare it to>
		 * for example class Person implements Comparable<Person>*/
		addPeople(peopleSet);
		System.out.println("Printing Unsorted List of People");
		showPeople(peopleList);
		Collections.sort(peopleList);
		System.out.println("Printing Sorted List of People");
		showPeople(peopleSet);
		/*Also since people is an object of class person you can not sort
		 * the collection in arrayList either.*/
		/*to make the class Person Implement Comparable interface
		 * class Person implements Comparable<thing you want to compare it to>
		 * for example class Person implements Comparable<Person>*/
		System.out.println("Printing People Set");
		showPeople(peopleSet);
		
	}
	
	/*Add elements to whatever collections I pass into addElement Function */
	/*if I want to pass a list or set and we don't know what we want to pass
	 * we can do this using Collection interface which is super interface 
	 * */
	private static void addElements(Collection<String> col){
		col.add("Joe");
		col.add("Sue");
		col.add("Juliet");
		col.add("Clare");
	}
	 private static void showElements(Collection<String> col){
		 for(String elements: col){
			 System.out.println("Elements :" +elements);
		 }
	 }
	private static void addPeople(Collection<Person> col){
		col.add(new Person("Joe"));
		col.add(new Person("Sue"));
		col.add(new Person("Juliet"));
		col.add(new Person("Clare"));
	}
	private static void showPeople(Collection<Person> col){
		 for(Person people: col){
			 System.out.println("Elements :" +people);
		 }
	 }

}
