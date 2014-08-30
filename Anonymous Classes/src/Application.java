/*Anonymous classes are way of extending or interfacing a class at one 
 *time */
class Machine{
	public void start(){
		System.out.println("Starting Machine");
	}
}
interface Plant{
	/*now to implement this method we can use Anonymous class.*/
	public void grow();
}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*The way the Anonymous Class works is , lets say
		 * I want to over ride start method in Machine class.*/
		Machine machine1 = new Machine(){
			/*I can override methods here :) Now when I create a
			 * new object of Machine by saying new Machine and then do 
			 * something like this, this small little section becomes 
			 * extended , just as a child class with no name that is why it
			 * is called Anonymous Class*/
			@Override 
			public void start(){
				System.out.println("Camera Started");
			}
		};
		machine1.start();
		/*now if I do this Plant plant1 = new Plant() it will give me 
		 * an error saying the object can't be instanciated because it 
		 * is an interface and you can't instanciate interface. However you
		 * can do this*/
		Plant plant1 = new Plant(){

			@Override
			public void grow() {
				// TODO Auto-generated method stub
				System.out.println("Growing");
			}
			
		};
		/*now I can do this: */
		plant1.grow();

	}

}
