import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
/*Keys in a map are unique unlike values. Values don't have to be unique at all*/
import java.util.Set;

class Person {
	private int id;
	private String name;

	public Person(int id, String name) {

		this.id = id;
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	/*if I want that if two object with same id are similar then I should choose 
	 * that from source>hashcode or if I want to define to objects as similar by
	 * name I can do that too.*/

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	/*This is producing same id for same object and different for different*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("HashMap");
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("One", 1);
		hashMap.put("Two", 2);
		hashMap.put("Three", 3);
		hashMap.put("Four", 4);
		hashMap.put("Five", 5);
		hashMap.put("One", 4);
		/* Iterating through a set using for each loop */
		for (String key : hashMap.keySet()) {
			System.out.println("Key: " + key + " Value: " + hashMap.get(key));
		}
		System.out
				.println("-----------------------------------------------------------\n");
		System.out.println("LinkedHashMap");
		Map<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
		linkedHashMap.put("One", 1);
		linkedHashMap.put("Two", 2);
		linkedHashMap.put("Three", 3);
		linkedHashMap.put("Four", 4);
		linkedHashMap.put("Five", 5);
		linkedHashMap.put("One", 4);
		/* Iterating through a set using for each loop */
		for (String key : linkedHashMap.keySet()) {
			System.out.println("Key: " + key + " Value: "
					+ linkedHashMap.get(key));
		}
		System.out
				.println("-----------------------------------------------------------\n");
		System.out.println("LinkedSet");
		/*
		 * Sets are like map but they don't have values for each element. And
		 * they store unique keys only
		 */
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("Dog");
		linkedHashSet.add("Cat");
		linkedHashSet.add("Mouse");
		linkedHashSet.add("Cat");
		/*Always remember sue with id 1 and sue with id 3 are duplicate*/
		System.out.println("Passing Objects to Maps and Sets");
		System.out
		.println("-----------------------------------------------------------\n");
		Person person0 = new Person(0, "Bob");
		Person person1 = new Person(1, "Sue");
		Person person2 = new Person(2, "Mike");
		Person person3 = new Person(1, "Sue");
		System.out.println("Passing Objects to Map");
		Map<Person, Integer> personLinkedHashMap = new LinkedHashMap<Person, Integer>();
		personLinkedHashMap.put(person0,1);
		personLinkedHashMap.put(person1, 2);
		personLinkedHashMap.put(person2, 3);
		personLinkedHashMap.put(person3, 1);
		for (Person key : personLinkedHashMap.keySet()) {
			System.out.println("Key: " + key + " Value: " + personLinkedHashMap .get(key));
		}
		System.out.println("Passing Objects to Set");
		Set<Person> personLinkedHashSet = new LinkedHashSet<Person>();
		personLinkedHashSet.add(person0);
		personLinkedHashSet.add(person1);
		personLinkedHashSet.add(person2);
		personLinkedHashSet.add(person3);
		for (Person person : personLinkedHashSet) {
			System.out.println("Set person: "+person);
		}
		/*So we can conclude that set and map can not distinguish between the 
		 * values of the object. To make this work we have to give person class
		 * hashcode for equal codes. refer1 to person class*/
	}



}
