package priorityQueue;

import java.util.PriorityQueue;

public class Main {
	
	public static void main(String args[]) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.add(25);
		pq.add(-22);
		pq.add(1343);
		pq.add(54);
		pq.add(0);
		pq.add(-3492);
		pq.add(429);
		
		// Will print the array from the queue, using toArray() method.
		Object[] ints = pq.toArray();
		for(Object num: ints) {
			System.out.println(num);
		}
		
		System.out.println();
		
		System.out.println(pq.peek());
		
		System.out.println(pq.remove()); // Will return removed highest priority queue item, as no value given as parameter
		System.out.println(pq.peek());
		
		System.out.println(pq.poll()); // Will also return removed highest priority queue item, but it only removes root value.
		System.out.println(pq.peek());
		
		System.out.println(pq.remove(54));
		
		pq.add(-1);
		System.out.println(pq.peek()); 
	}

}
