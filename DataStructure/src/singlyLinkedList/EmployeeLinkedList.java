package singlyLinkedList;

public class EmployeeLinkedList {
	
	private EmployeeNode head;
	private int size; // It's value will be set to 0 by default when the list gets created.
	
	public void addTofront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		head = node;
		size++; // This will keep the count of the items in list.
	}
	
	public EmployeeNode removeFromFront() {
		if(isEmpty()) {
			return null;
		}
		
		EmployeeNode removedNode = head;
		head = head.getNext();
		size--;
		removedNode.setNext(null); // This will completely remove the node & value inside it from memory.
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
			System.out.print(" -> ");
			current = current.getNext();
		}
		System.out.println("null");
	}

}
