package doublyLinkedList;

public class EmployeeDoublyLinkedList {
	
	private EmployeeNode head;
	private EmployeeNode tail;
	private int size; // It's value will be set to 0 by default when the list gets created.
	
	public void addTofront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		
		if(head == null ) {
			tail = node;
		}
		else {
			head.setPrevious(node);
			node.setNext(head);
		}
		
		head = node;
		size++; // This will keep the count of the items in list.
	}
	
	public void addToEnd(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		if(tail == null) {
			head = node;
		}
		else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
		tail = node;
		size++;
	}
	
	public boolean addBefore(Employee newEmployee, Employee existingEmployee) {
		if(head == null) {
			return false;
		}
		
		EmployeeNode current = head;
		
		while(current != null && !current.getEmployee().equals(existingEmployee)) {
			current = current.getNext();
		}
		
		if(current == null) {
			return false;
		}
		
		EmployeeNode newNode = new EmployeeNode(newEmployee);
		newNode.setPrevious(current.getPrevious());
		newNode.setNext(current);
	//	current.getPrevious().setNext(newNode);
		current.setPrevious(newNode);
		
		if(head == current) {
			head = newNode;
		}
		else {
			newNode.getPrevious().setNext(newNode);
		}
		
		size++;
		return true;
	}
	
	public EmployeeNode removeFromFront() {
		if(isEmpty()) {
			return null;
		}
		
		EmployeeNode removedNode = head;
		
		if(head.getNext() == null) {
			tail = null;
		}
		else {
			head.getNext().setPrevious(null);
		}
		
		head = head.getNext();
		size--;
		removedNode.setNext(null); // This will completely remove the node & value inside it from memory.
		return removedNode;
 	}
	
	public EmployeeNode removeFromEnd() {
		if(isEmpty()) {
			return null;
		}
		
		EmployeeNode removedNode = tail;
		
		if(tail.getPrevious() == null) {
			head = null;
		}
		else {
			tail.getPrevious().setNext(null);
		}
		
		tail = tail.getPrevious();
		size--;
		removedNode.setPrevious(null);
		return removedNode;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void printList() {
		EmployeeNode current = head;
		System.out.print("Head -> ");
		while(current != null) {
			System.out.print(current);
			System.out.print(" <=> ");
			current = current.getNext();
		}
		System.out.println("null");
	}

}
