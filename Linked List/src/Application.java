/*for end of the list use array list
 * and bringing and middle should be used in linked LIst*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Array list manages arrays internally. if we look into array list
		 * its is just bunch of elements like this [0][1][2][3].... so adding to the
		 * array list at end is pretty fast and getting item from the array list is 
		 * pretty fast. you can specify the initial size of the array like this:
		 *ArrayList<Integer> arrayList = new ArrayList<Integer>(100); however 
		 *the default size of the array list is 10. Suppose we have an array of default
		 * items (10) and if we add the 11th item, arrayList would create a new array 
		 * twice that of size of 10 and copy old array to new array and then add the 
		 * 11th item that is the time it can be slow.
		 * so now if we want to add an item in middle , all the elements in array
		 * would be moved one unit up and then we add the data, which is slow.
		 * */
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		/*
		 * In linkedList each element has a reference to the previous and next elements
		 * internally it looks like this [0]->[1]->[2].... / [0]<-[1]<-[2]
		 * so to get a particular item from this kind of list takes time because
		 * we would have to travel though each element , get the link to next element
		 * until we reach the desired element.
		 * If we want to add an item in beween 0 and 1 ,[0]->[1]->[2]., so 
		 * we will point the 0 element to new addition and new addition to one
		 * [0]->[new]->[1].... which is relatively fast.
		 * 
		 * */
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
	/*Passing these list into function*/
		/*Since Arraylist and LInked List implements the list interface
		 * we can pass arraylist or linked list as a list to a function. 
		 * Hence we won't have to worry about they type of list. */
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
		/*Infact we can also do this : */
		List<Integer> listArrayList = new ArrayList<Integer>();
		List<Integer> listLinkedList = new LinkedList<Integer>();
		/*All we care about is when we create an instance
		 * for example ArrayList<Integer>*/
		/*If you want to remove the item from the end use array list if
		 * you have to remove the item from the beginning or the middle
		 *  use the linked list*/
	}
	/*to pass list to the function we will pass List interface with 
	 * Parameterized integer*/
	private static void doTimings(String type, List<Integer> list){
		for(int i=0;i<1E5;i++){
			/*Adding elements to the list i.e populating the list 
			 * the list*/
			list.add(1);
		}
		/*Now I want to calculate the time it takes to execute the commands*/
		/*Add item to the end of the list*/
		long start = System.currentTimeMillis();
		for(int i=0; i<1E5;i++)
		{
			list.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken to add item at end of the list : " + (end-start) + " ms for type: " +type);
		/*Add item to the begning of the list*/
		long start1 = System.currentTimeMillis();
		for(int i=0; i<1E5;i++)
		{
			/*There is a version of add which takes index as the first parameter
			 * so we will use that */
			list.add(0,i);
		}
		long end1 = System.currentTimeMillis();
		System.out.println("Time taken to add item at the front of the list : " + (end1-start1) + " ms for type: " +type);
	}

}
