/*We cover Access level modifiers, Public protected and private */
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plant plant = new Plant();
		System.out.println("public plant.name: "+plant.name);
		System.out.println("public static final ID: "+plant.ID);
		/*System.out.println(plant.type) is not accessible here*/
		System.out.println("Plant.size: " + plant.size);
	}

}
