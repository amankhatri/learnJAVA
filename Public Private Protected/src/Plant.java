
public class Plant {
	/*public method or variable is acceable through the instance of this 
	 * class in any of the other classes in the project*/
	public String name;
	/*it is a bad pactice to keep your variables public and we have
	 * to hide them from the world, however if we want to a public variable in class 
	 * we should try to make it a constant be declaring it as a static and final variable which 
	 * would be accessible from other classes but no one would be able to change it. */
	public final static int ID = 8;
	/*Private variable is not accessible by any other class in the project not even children*/
	private String type;
	/*where as protected type of variables are accessible to children and all classes in
	 * same package but not to other classes outside packages unless you import the package.
	 * */
	protected String size;
	public Plant(){
		this.name = "Freedy";
		this.type = "Plant";
		this.size = "Large";
		
	}
}
