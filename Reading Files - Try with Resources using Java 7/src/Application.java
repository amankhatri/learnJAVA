class Temp implements AutoCloseable{
/*http://docs.oracle.com/javase/7/docs/api/java/lang/AutoCloseable.html*/
/*Class temp is implementing methods from interface Autocloseable*/
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Closing");
		throw new Exception("Oh no");
	}
	
}
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*we can also do this and this is called try with
		 * resources*/
		/*if we implement close via Autocloseable interface
		 * we would not have to worry about the result of
		 * closing the file regardless of the fact that
		 * the files exists or not*/
		try(Temp temp1 = new Temp()){
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
