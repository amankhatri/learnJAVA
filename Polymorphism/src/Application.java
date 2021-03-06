
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		/*If you have a child class and a parent class you can 
		 * always use child class instead of Parent and this is 
		 * called poly morphism*/
		Plant plant2 = plant1; //here plant2 refers to the same thing as plant1 which is new Plant() obj
		//because of poly morphism I can do this:
		Plant plant3 = tree;
		plant3.grow(); // this calling the grow from class Tree
		/*So here in above line the plant3 refers to the object
		 * tree so it calls the funtion grow from Tree*/
		/*However if I do this: plant3.shedLeaves() it doesn't work
		 * the reason being that plant3 is a type of Plant and the class
		 * Plant doesn't have shedLeaves method in it.*/
		/*Now if I do this:*/
		Plant plant4;
		/*plant4 knows what methods it can call, that is the 
		 * methods in class PLant and the super class object, however 
		 * to instanciate the object we might have to set it equal 
		 * to the new Plant()*/
		doGrow(tree);
	}
		public static void doGrow(Plant plant)
		{
			plant.grow();
		}
}
