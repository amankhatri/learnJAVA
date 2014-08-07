
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//my number is type integer, it can hold a negative number or a positive number
		int myNumber = 88; //An int is a 32 bit value in JAVA
		short myShort = 847; // Another data type
		long myLong = 888 ; // Another data type
		double myDouble = 22.3; //float type data, there is not a long version of double but there is long
		float myFloat = 22.345f; //float is the long double
		char myChar = 'A'; // character is a data type written between the single quotes, UNICODE
		boolean myBoolean = false;
		byte myByte = 127; // this holds one byte of data which is 2^8
		
		
		//println is print in new line
		System.out.println(myNumber);
		//printf is in C format print
		System.out.printf("The variable myNumber has a value of: %d.\n",myNumber);
		System.out.printf("My short number is: %d.\n", myShort);
		System.out.print("My Long: ");
		System.out.println(myLong);
		System.out.print("My Double: ");
		System.out.println(myDouble);
		System.out.print("My Float: ");
		System.out.println(myFloat);
		System.out.print("My Char:");
		System.out.println(myChar);
		System.out.print("My Boolean: ");
		System.out.println(myBoolean);
		System.out.print("My Byte: ");
		System.out.println(myByte);

	}

}
