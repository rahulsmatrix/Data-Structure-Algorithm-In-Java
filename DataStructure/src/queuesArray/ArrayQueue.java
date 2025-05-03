package queuesArray;

import java.util.NoSuchElementException;

public class ArrayQueue {
	
	private Employee[] queue;
	private int front;
	private int back; 
	
	// Initially the front and back both will be zero so we don't need to initialize them in constructor.
	
	public ArrayQueue(int capacity) {
		queue = new Employee[capacity];
	}
	
	public void add(Employee employee) {
		if(back == queue.length) {
			
			// The current 'if' condition will fail in a particular case where we keep on adding & removing an employee.
			// As we are making the front queue null while removing, the adding (enqueue) will happen at next index.
			
			// For example in an Array of size 5 : (Precondition is added & removed (made null) & then again added in last)
			// index 0 - null
			// index 1 - null
			// index 2 - null
			// index 3 - null
			// index 4 - mikeWilson - front
			// (Here back will become 5, as back position is just after the last entry.)
			
			// Now even though our ArrayQueue is empty or has null value, the 'if' condition will still double the size of it.
			// As a solution we should not assign null & should try to shift the values in ArrayQueue after removing. OR
			// We can also make it a Circular Queue. 
			
			Employee[] newArray = new Employee[2 * queue.length];
			System.arraycopy(queue, 0, newArray, 0, queue.length);
			queue = newArray;
		}
		
		queue[back] = employee;
		back++;
	}
	
	public Employee remove() {
		if(size() == 0) {
			throw new NoSuchElementException();
		}
		
		Employee employee = queue[front];
		queue[front] = null;
		front++;
		if(size() == 0) {
			front =0;
			back =0;
		}
		
		return employee;
	}
	
	public Employee peek() {
		if(size() == 0) {
			throw new NoSuchElementException();
		}
		
		return queue[front];	
	}
	
	public int size() {
		return back - front;
	}
	
	public void printQueue() {
		for(int i=front; i<back; i++) {
			System.out.println(queue[i]);
		}
	}

}
