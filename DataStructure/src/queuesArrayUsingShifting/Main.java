package queuesArrayUsingShifting;

public class Main {
	
	public static void main(String[] args) {
		
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 789);
		
		ArrayQueueWithShifting queue = new ArrayQueueWithShifting(5);
		
		queue.addToBack(janeJones);
		queue.addToBack(johnDoe);
		queue.addToBack(marySmith);
		queue.addToBack(mikeWilson);
		queue.addToBack(billEnd);
		
//		queue.printQueue();
		
		queue.remove();
		queue.remove();
//		queue.printQueue();
		
//		System.out.println("Peeking at front : " + queue.peek());
		
		queue.remove();
		queue.remove();
		queue.remove();
		
		queue.printQueue();
		
//		queue.addToBack(janeJones);
//		queue.addToBack(johnDoe);
//		queue.remove();
//		queue.addToBack(marySmith);
//		queue.remove();
//		queue.addToBack(mikeWilson);
//		queue.remove();
//		queue.addToBack(billEnd);
//		queue.remove();
//		queue.addToBack(janeJones);
//		
//		queue.printQueue();
	}

}
