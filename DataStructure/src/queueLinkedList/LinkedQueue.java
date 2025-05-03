package queueLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class LinkedQueue {
	
	private Queue<Employee> queue;
	
	
	public LinkedQueue() {
		queue = new LinkedList<Employee>();
	}
	
	public void add(Employee employee) {
		queue.add(employee);
	}
	
	public Employee remove() {
		return queue.remove(); 
	}
	
	public Employee element() {
		// This method is for peeking at an element and returns "NoSuchElementException" when Queue is empty.
		return queue.element();
	}
	
	public Employee peek() {
		// This method is also for peeking at an element, but returns a special value when Queue is empty.
		return queue.peek();
	}
	
	public void printQueue() {
		Iterator<Employee> iterator = queue.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
