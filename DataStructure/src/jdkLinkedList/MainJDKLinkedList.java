package jdkLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class MainJDKLinkedList {
	
	public static void main(String[] args) {
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 78);
		
		LinkedList<Employee> list = new LinkedList<Employee>(); // Using LinkedList class from JDK, it's a doubly linked list class.
		
		list.addFirst(janeJones); // addFirst() method adds to the front of the list.
		list.addFirst(johnDoe);
		list.addFirst(marySmith);
		list.addFirst(mikeWilson);
		
		Iterator iter = list.iterator(); // print the list.
		System.out.print("Head ->");
		while(iter.hasNext()) {
			System.out.print(iter.next());
			System.out.print("<=>");
		}
		System.out.println("null");
		
		list.add(billEnd); // add() method adds to the end of the list, addLast() method is also same.
		iter = list.iterator(); 
		System.out.print("Head ->");
		while(iter.hasNext()) {
			System.out.print(iter.next());
			System.out.print("<=>");
		}
		System.out.println("null");
		
		list.removeFirst(); // removeFirst() & remove() method removes first item from the list.
		iter = list.iterator(); 
		System.out.print("Head ->");
		while(iter.hasNext()) {
			System.out.print(iter.next());
			System.out.print("<=>");
		}
		System.out.println("null");
		
		list.removeLast(); // removeLast() method removes last item from the list.
		iter = list.iterator(); 
		System.out.print("Head ->");
		while(iter.hasNext()) {
			System.out.print(iter.next());
			System.out.print("<=>");
		}
		System.out.println("null");
		
//		for(Employee employee: list) {
//			System.out.println(employee);
//		}
		
	}

}