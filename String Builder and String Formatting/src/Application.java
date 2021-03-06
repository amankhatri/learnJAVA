
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Strings in java are im-mutable and once you have created a string
		 * you can never change it*/
		/*This is in efficient way of building string*/
		String info = "";
		// I am adding to info
		info += "My name is Bob.";
		//add space to info string
		info += " ";
		//add I am a builder to info string.
		info +="I am a builder.";
		// here I am making a new string builder everytime I call info
		System.out.println("Info: "+info);
		info = "";
		System.out.println("Info: "+info);
		//Efficient way of building string
		StringBuilder sb = new StringBuilder();
		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion");
		System.out.println(sb.toString());
		//the append method returns a reference to string object itself so we can do 
		//this:
		StringBuilder s = new StringBuilder();
		s.append("My name is Roger")
		/*so since append is returning reference to "s" i can just do this:*/
		.append(" ")
		.append("I am a skydiver");
		System.out.println("S : "+s.toString());
		// using string buffer is preffered over using string builder, because and is
		//safe for use with multiple threads.
		
		//Now we will do string formating: 
		System.out.println("Here is some text. \t that is a tab \\t.");
		System.out.printf("This is print format: %s ",s.toString() );
		for(int i=0;i<20;i++)
		{
			//%2d means width of two
			System.out.printf("%2d some text here \n", i);
		}
	}

}
