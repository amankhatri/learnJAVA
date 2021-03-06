import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/*Complex data types using collections*/
public class Application {
	/*if you know what kind of data you are going to get then you should have classes defined for 
	 * can use array list or any other list to store data. However when you are not aware of
	 * the data you are going to get as in this scenario and you want to hold that data in memory that is when you use a complex
	 * data type. Remember this sort of scenario might occur when you read xml files or any other file where you don't know what you are 
	 * going to get*/
	/*we are given sample data and we have to store them. Vehicles and drivers are the analogous to data which you get in 
	 * xml or from any other data base. We have list of vehicles and the list of drivers who can correspondingly drive
	 * each of the vehicles. For example fred sue pete can drive ambulance. so if fred is not available call sue, if
	 * sue is not available next qualified driver is pete.*/
	public static String[] vehicles = {
		"ambulance","helicopter","lifeboat"
	};
	/*2D array of strings*/
	public static String[][] drivers = {
		{"Fred","Sue","Pete"},{"Sue", "Richard","Bob","Fred"},
		{"Pete","Hary","Bob"}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ideally we would have used a list but since we want to look things up using strings and not index so we will 
		 * use maps and since we don't care about the order we will not use sorted map */
		Map<String,Set<String>> personal = new HashMap<String,Set<String>>();
		/*Iterate though the vehicles and collate vehicles from drives using the index from vehicles*/
		for(int i=0;i<vehicles.length;i++){
			String vehicle = vehicles[i];
			String[] driversList = drivers[i];
			//System.out.println("Vehicles: "+vehicle+ ", Drivers for Specified Vehicles: " +driversList );
			/*we have not create any instance of set so we have to do that and we want the list to be ordered*/
			Set<String> driverSet = new LinkedHashSet<String>();
			for(String driver: driversList){
				driverSet.add(driver);
			}
			personal.put(vehicle, driverSet);
		}
		// Example Usage
			Set<String> driversList = personal.get("helicopter");
			for(String list  : driversList){
				System.out.println(list);
			}
		//Iterating through the whole thing
			for(String vehicle : personal.keySet()){
				System.out.println("Vehicle: " +vehicle +" Drivers: " +personal.get(vehicle));
				
			}
			
	}

}
