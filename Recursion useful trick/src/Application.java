/*Recursion is an algorithm. Recursion is calling the
 * method inside of itself*/
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*when you call a method inside different method
		 * like we are calling calculate(4) in main method
		 *The special area of memory in JVM called stack. And
		 *stack is used for local variables and remembering which
		 *method called which method. whereas the heap is type of
		 *memory where object is store, i.e whenever you create 
		 *a new object it is stored in heap. Heap is generally bigger
		 *than stack */
		calculate(4);
		/**/
		System.out.println(calculateFactorial(4));
		
	}
	private static void calculate(int value){
		/*The reason I made it static is because of the 
		 * fact that I am declaring it in the same class
		 * and I am calling it in same class.  */
		System.out.println(value);
		/*Recursion occurs when you do call calculate();
		 * here. so when you are calling calculate method
		 * again and again stacks gets filled up and it
		 * shows stack overflow error*/
		/*now we have to find a way to stop calling the 
		 * calculate at some time to avoid stack overflow*/
		/*now where as if you call calculate(value-4) inside 
		 * calculate(int) method it will run for some time 
		 * and then it would give same stack overflow error
		 * so to stop recursion we can do this: */
		if(value ==1){
			return;
		}
		else{
			calculate(value-1);
		}
		/*we can do useful stuff with it like calculate
		 * factorials */	
		
		
	}
	private static int calculateFactorial(int value){
		if(value == 1){
			return 1;
		}
		else{
			return calculateFactorial(value-1)*value;
		}
		
	}

}
