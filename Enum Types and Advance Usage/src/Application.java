
public class Application {
	//REF 2
	/*public static final int DOG = 0;
	public static final int CAT = 1;
	public static final int HORSE = 2;*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*often in programming we have variables that can only 
		 * take certain values that represents certain things. 
		 * lets declare int animal which can take certain values
		 * declared as DOG , CAT and Horse which are constant*/
		
		/*int animal = CAT; 
		switch(animal){
		case DOG:
			System.out.println("DOG");
			break;
		case CAT:
			System.out.println("CAT");
			break;
		case HORSE:
			System.out.println("HORSE");
			break;
		}*/
		/*Problem: Now here variable animal can take any values i.e 
		 * it is not restricted to DOG CAT and HORSE. Also another
		 * problem is we should know the the constant variables
		 * should be declared like DOG, CAT, HORSE. I might not know
		 * that constant exist. So we want a special kind of variable
		 * to make sure that the variable takes one of the three values. 
		 * this special variable in ENUM. ENUM type has perticular set of the 
		 * values.Enum is like creating classes or interfaces, so right click 
		 * default package and click new ->enum*/
		/*Ref1 look in Animal.java*/
		
		/*now we can do this: */
		Animal animal = Animal.CAT;
		
		switch(animal){
		case CAT:
			System.out.println("Cat");
			break;
		case DOG:
			System.out.println("DOG");
			break;
		case HORSE:
			System.out.println("HORSE");
			break;
		default:
			break;
		}
		System.out.println(Animal.DOG.getClass());
		System.out.println(Animal.CAT instanceof Animal);
		/*and since java.Enum is the parent class of any ENum tyoe
		 * so Animal.CAT is also an instance of ENUM*/
		System.out.println(Animal.CAT instanceof Enum);
		System.out.println(Animal.HORSE.getName());
		/*Ref3*/
		System.out.println("Emum name as a string "+Animal.DOG.name());
		/*ref3*/
		Animal animal2 = Animal.valueOf("CAT");
		System.out.println(animal2);
		
		
		
		
		
	}

}
