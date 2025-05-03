package singlyLinkedList;

public class MainSinglyLinkedList {
	
	public static void main(String[] args) {
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		
		
		EmployeeLinkedList list = new EmployeeLinkedList();
		
		System.out.println(list.isEmpty()); // This will give true as we didn't added any employee to the list yet.
		
		list.addTofront(janeJones);
		list.addTofront(johnDoe);
		list.addTofront(marySmith);
		list.addTofront(mikeWilson);
		
		System.out.println(list.getSize());
		
		list.printList();
		
		list.removeFromFront();
		System.out.println(list.getSize());
		list.printList();
	}

}