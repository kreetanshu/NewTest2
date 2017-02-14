package sortingcollections;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QuequeAndStack {

	public static void main(String[] args) {
		Queue<Integer> qu =new ArrayBlockingQueue<>(3);
		
		
		qu.add(1);
		qu.add(2);
		qu.add(3);
		
		System.out.println("The element method = "+qu.element());
		System.out.println("The remove method = "+qu.remove());
		System.out.println("The remove method = "+qu.remove());
		Queue<Integer> qu2 =new ArrayBlockingQueue<>(3);
		qu2.offer(9);
		qu2.offer(8);
		qu2.offer(7);
		System.out.println("The element method = "+qu2.peek());
		System.out.println("The remove method = "+qu2.poll());
		System.out.println("The remove method = "+qu2.poll());
		System.out.println("The remove method = "+qu2.poll());
		System.out.println("The remove method = "+qu2.poll());
		
	}

}
