package stackLinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {
	
	private LinkedList<Employee> stack;
	
	// This linked list is a Doubly Linked List, & for stack we don't need a doubly Linked List 
	// because we are always working with the item that's at the front of the list.
	// But we can still use it as memory won't be an issue.
	
	public LinkedStack() {
		stack = new LinkedList<Employee>();
	}
	
	// Here we are using LinkedList for Stack but to make it behave like a stack we are only defining push(), pop() & peek() methods here.
	// So that other methods of LinkedList like add(), remove(), get() etc. can't be used as it's an stack implementation.
	
	public void push(Employee employee) {
		stack.push(employee);
	}
	
	public Employee pop() {
		return stack.pop();
	}
	
	public Employee peek() {
		return stack.peek();
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public void printStack() {
		ListIterator<Employee> iterator = stack.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// This iterator traverses the list from head to tail 
		// And in LinkedList implementation of a stack the top item is always at the head. 
		// So it will be printing from the top down.
	}

}
