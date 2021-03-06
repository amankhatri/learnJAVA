import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Queue is a row, Queue is a row of people Queue can be row of
		 * ooooooooooooo s. People enter at the end of the queue and 
		 * leave from the front of the queue.  
		 * leave(head)<---------000000000000000000000000<--------Enter(tail) 
		 * In programming lingo Queue starts from front  or the head
		 * and end of the queue is called the tail. Queue is first in first
		 * out structure. So sooner you enter the queue and sooner you leave
		 * All Known Implementing Classes:
		 * AbstractQueue, ArrayBlockingQueue, ArrayDeque, ConcurrentLinkedDeque, 
		 * ConcurrentLinkedQueue, DelayQueue, LinkedBlockingDeque, LinkedBlockingQueue,
		 * LinkedList, LinkedTransferQueue, PriorityBlockingQueue, 
		 * PriorityQueue, SynchronousQueue*/
		/*We will talk about arrayblockingqueue. Queue<Integer> 
		 * q1 = new ArrayBlockingQueue<Integer>(size). if we add more than
		 * size number of elements the queue thows an exception*/
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);	
		/*Queue has two different sets of methods:
		 *Throws exception	and Returns special value. we can 
		 *iterate though the loop */
		q1.add(10);
		q1.add(20);
		q1.add(30);
		try {
			q1.add(40);
		} catch (IllegalStateException e) {
			// TODO: handle exception
			System.out.println("Tried to add too many items to the Queue");
		}
		for(Integer value: q1){
			System.out.println("Value: " +value);
		}
		/*remove removes the first element from head*/
		Integer value = q1.remove();
		System.out.println("Value Removed: " +value);
	}

}
