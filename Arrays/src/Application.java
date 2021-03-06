
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// value is primitive type int and it allots 32 bits for storing the value of variable "value".
		/*"value" is "int" type of value*/
		int value = 7; 
		/*Where as the variable "values" refers to the whole list of integer. hence "values" is reference type
		 * variable*/
		int[] values;
		/*Now we will allocate memory and we will mention the number of integers, 3 in this case, which we
		 * want the "values" variable to refer to.*/
		values = new int[3]; // "new" keyword allocates a memory to store 3 integers which is 3x32 bits which
		//is referred by the variable "values";
		/*values[0] the number zero refers to the 1st value referred by variable "values"*/
		values[0] = 1;
		values[1] = 2;
		values[2] = 3;
		System.out.println("Values: ");
		for(int i = 0; i<values.length;i++)
		{
			System.out.println(values[i]);
		}
		// we can also assign the values to an array by using
		int[] numbers = {1 , 2, 3, 4, 5};
		System.out.println("Numbers: ");
		for(int i = 0; i<numbers.length;i++)
		{
			System.out.println(numbers[i]);
		}
	}

}
