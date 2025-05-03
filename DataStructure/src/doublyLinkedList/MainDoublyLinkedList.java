package doublyLinkedList;

public class MainDoublyLinkedList {
	
	public static void main(String[] args) {
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		
		Employee billEnd = new Employee("Bill", "End", 789);
		
		EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
		
		list.addTofront(janeJones);
		list.addTofront(johnDoe);
		list.addTofront(marySmith);
		list.addTofront(mikeWilson);
		
		list.printList();
		System.out.println(list.getSize());
		
		list.addBefore(billEnd, johnDoe);
		list.printList();
		System.out.println(list.getSize());
		
//		Employee billEnd = new Employee("Bill", "End", 78);
//		list.addToEnd(billEnd);
//		list.printList();
//		System.out.println(list.getSize());
//		
//		list.removeFromFront();
//		list.printList();
//		System.out.println(list.getSize());
//		
//		list.removeFromEnd();
//		list.printList();
//		System.out.println(list.getSize());
	}

}