package queuesArrayUsingShifting;

import java.util.NoSuchElementException;

public class ArrayQueueWithShifting {
	
	private Employee[] queue;
	private int front;
	private int back;
	
	public ArrayQueueWithShifting(int capacity) {
		queue = new Employee[capacity];
	}
	
	public void addToBack(Employee employee) {
		if(back == queue.length) {
			Employee[] newArray= new Employee[2 * queue.length];
			System.arraycopy(queue, 0, newArray, 0, queue.length);
			queue = newArray;
			System.out.println(queue.length);
		}
		queue[back] = employee;
		back++;
	}
	
	public Employee remove() {
		if(size() == 0) {
			throw new NoSuchElementException();
		}
		Employee employee = queue[front];
		for(int i=0; i < back-1; i++) {
			queue[i] = queue[i+1];
		}
		queue[back-1] = null;
		back--;
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
		if(size() == 0) {
			System.out.println("Queue is empty.");
		}
		for(int i=front; i<back; i++) {
			System.out.println(queue[i]);
		}
	}

}
