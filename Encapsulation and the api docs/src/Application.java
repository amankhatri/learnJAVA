
/*We will see why do we use public, private and protected*/
class Plant {
	private String name;
	/*The idea of encapsulation is to avoid people from getting
	 * to know the guts of that class. So you just expose certain methods
	 * or variables to make them visible to people or the public. Remember you can
	 * always use getters and setters.*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	/*some times you make variables public but you make
	 * them static and finals
	 * like this :*/
	public static final int ID = 7;//can't change it outside class
	/*if you have a public method like this:*/
	public String getData(){
		String data = "Some Stuff " + calculateGrowthForecast();
		return data;
	}
	/*Now if you have a method which class uses internally, like:*/
	private int calculateGrowthForecast(){
		/*so the idea is to not letting it be used outside the class plant so
		 * we will make the method private*/
		return 9;
	}
	/*if you want something to be accessed by other classes, specially 
	 * the variables just make them protected unless you really want
	 * user to be able to access the method or the variable.*/
	/*For user to understand how to use public methods from classes you have
	 * to well document it and generate an API for it. Also, if two classes a
	 * are always talking to each other they are called Tightly Coupled classes*/
}
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
