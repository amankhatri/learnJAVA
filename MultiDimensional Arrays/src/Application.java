
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//multidimentional array can have different number of elements like 
		int[][] grid = {{1,2,3},{2,3},{3}};
		System.out.println("grid[0][0]: " + grid[0][0]);
		System.out.println("grid[0][1]: " + grid[0][1]);
		System.out.println("grid[0][2]: " + grid[0][2]);
		System.out.println("grid[1][0]: " + grid[1][0]);
		System.out.println("grid[1][1]: " + grid[1][1]);
		System.out.println("grid[2][0]: " + grid[2][0]);
		System.out.println("Printing using loop: ");
		System.out.println("grid.length: " +grid.length);
		for(int row=0; row<grid.length;row++)
		{
			for(int col =0;col<grid[row].length;col++)
			{
				System.out.println("grid[row][col]: " +grid[row][col]);
			}
		}
		
		//another way for declaring string type of array
			
		String[][] text = new String[2][3];
		text[0][1] = "Hello";
		System.out.println("text[0][1]: " + text[0][1]);
		// you can also do something like this- set only one dimention of array and :
		String[][] words = new String[2][];
		words[0] = new String[3];
		words[0][1]= "hi there";
		
		System.out.println("words[0][1]: "+words[0][1]);
		System.out.println("words[0][2]: "+words[0][2]);
	}

}
