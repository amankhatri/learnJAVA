/*All enum inhert from java.enum*/
public enum Animal {
	/*Now i can type this: */
	/*CAT, DOG, HORSE*/
	/*here since this is enum type, CAT has name value "Fergus " and
	 * so does others. Cat DOG and HORSE are special objects
	 * of class Animal and these can be turned into string by
	 * using name method REf4*/
	CAT("Fergus"),DOG("Fido"), HORSE("Henry"); /*cat dog and horse are the object of the type
	animal.*/
	/*And now I can remove the constant from the top of
	 * the main class look REF2*/
	/*we can have Enum methods and constructors. Constuctors of Enum
	 * shoud be private and it will have package level kind of 
	 * validity.
	 *  */
	private String name;
	Animal(String name){
		/*since constructor has a name parameter we need  to name 
		 * cats and dogs and horses to have */
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
	public String toString(){
		return "This animal is callsed: " +name;
	}
	
	
	
}
