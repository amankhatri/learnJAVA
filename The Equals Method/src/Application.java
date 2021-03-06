class Person{
	private int id;
	private String name;
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
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
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person(5, "Bob");
		Person person2 = new Person(8, "Sue");
		/*when I do person1 = person2 java tries to see if person1 is the same object as person2 , that is
		 * person1 = person2 which is false in case 1 and true in case 2*/
		System.out.println("Case 1");
		System.out.print("Is person1 = person2 : ");
		System.out.print(person1==person2);
		/*the see if the objects have the same value we can use equals method:*/
		System.out.println();
		System.out.println("person1 & person2 comparision with equal method: " + person1.equals(person2));
		/*Now even if I i do this:  person3.equals(person4) the equal function would return false
		 * because we have not yet overridden the method equal to tell it what to compare to achive this
		 * we will have to use hashcode and equal method. it comes up by right clicking on person class
		 * source generate hashcode and equal*/
		Person person3 = new Person(6, "Linda");
		Person person4 = new Person(6, "Linda");
		System.out.println("person1 & person2 comparision with equal method: " + person3.equals(person4));
		
		System.out.println("Case 2");
		person1 = person2;
		System.out.print("Is person1 = person2 : ");
		System.out.print(person1==person2);
		System.out.println("person1 & person2 comparision with equal method: " + person1.equals(person2));
		/*Let us see if it works with doubles and integers*/
		Double doubleValue1 = 7.2;
		Double doubleValue2 = 7.2;
		System.out.print("Checking if doubleValue1 == doubleValue2: ");
		System.out.println(doubleValue1 == doubleValue2);
		System.out.print("Checking if doubleValue1.equal(doubleValue2): ");
		System.out.println(doubleValue1.equals(doubleValue2));
		int intValue1 = 6;
		int intValue2 = 6;
		System.out.print("Checking if intValue1 == intValue2: ");
		System.out.println(intValue1==intValue2);
		/*Whenever two ints refer to the same value i.e 6 in this case
		 * the java makes a new object which refers to intValue1 and intValue2
		 * so basically intValue1=6=intValue2 which is some new object represented
		 * in java internally. == checks if two references are pointing at the same
		 * object where as .equal checks if they are same value or not */
		String strText1 = "Hello";
		String strText2 = "Hello";
		System.out.print("Checking if strText1 == strText2: ");
		System.out.println(strText1 == strText2);
		/*what java does is optimize the references and check if they are pointing
		 * to same objects. if you litrally have to check the variables or references
		 * are pointing to the same object then use == because equals method would 
		 * return true in this case too: */
		strText1 = "Hello";
		strText2 = "Hellodfasdf".substring(0, 5);
		System.out.println("strText2: "+strText2);
		System.out.print("Checking if strText1 == strText2: ");
		System.out.println(strText1 == strText2);
		System.out.print("Checking if strText1.equals(strText2): ");
		System.out.println(strText1.equals(strText2));
		/*For hashcode explaination: */
		/*when you don't have toString method in a Class this is what happens
		 * :*/
		System.out.println(new Object());
		/*i.e it returns the id which is unique for the Object class and
		 * is also called Hashcode*/
		
		
	}

}
