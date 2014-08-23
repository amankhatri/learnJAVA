
public class Oak extends Plant {
	public Oak(){
		/*we can not do type = "plant" in this child class*/
		/*Since size is protected you can access it in any subclasses or also within same pacakge*/
		this.size = "Large";
	}
	
}
