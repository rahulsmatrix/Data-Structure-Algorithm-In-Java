package queueLinkedList;

public class Main {
	
	public static void main(String[] args) {
		
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 789);
		
		LinkedQueue queue = new LinkedQueue();
		
		queue.add(janeJones);
		queue.add(johnDoe);
		queue.add(marySmith);
		queue.add(mikeWilson);
		queue.add(billEnd);
		
//		queue.printQueue();
		
//		System.out.println("Peeked at Employee: " + queue.element());
		
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		
		System.out.println("Peeked at Employee: " + queue.peek()); // Will return null when Queue is empty.
		System.out.println("Peeked at Employee: " + queue.element()); // Will return "NoSuchElementException" when Queue is empty.
		queue.printQueue();
		
//		queue.add(janeJones);
//		queue.add(johnDoe);
//		queue.remove();
//		queue.add(marySmith);
//		queue.remove();
//		queue.add(mikeWilson);
//		queue.remove();
//		queue.add(billEnd);
//		queue.remove();
//		queue.add(janeJones);
//		
//		queue.printQueue();
	}

}
