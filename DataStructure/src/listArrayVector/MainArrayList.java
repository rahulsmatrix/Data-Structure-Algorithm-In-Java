package listArrayVector;

import java.util.ArrayList;
import java.util.List;

public class MainArrayList {
	
	public static void main(String[] args) {
		
		// The reason we are saying List rather than ArrayList, If we decide later to use a different kind of List
		// It's easy to change the specific implementation of list that we're using.
		
		List<Employee> employeeList = new ArrayList<>(); 
		// Not defining the capacity as the default capacity is 10 which is enough for now.
		
		employeeList.add(new Employee("Jane", "Jones", 123));
		employeeList.add(new Employee("John", "Doe", 456));
		employeeList.add(new Employee("Mary", "Smith", 789));
		employeeList.add(new Employee("Mike", "Wilson", 3245));
		
		// ArrayList.add() method. It checks to see whether the array is full or not, if it's full then it will increase the size and then will add.
		
		employeeList.forEach(employee -> System.out.println(employee));
		// Used forEach loop with lambda expression. Can also use a for loop but the later is more concise.
		
		System.out.println(employeeList.get(1)); // Will give the second employee, ArrayList is backed by Array thus it's also 0 indexed.
		
		System.out.println(employeeList.isEmpty()); // Will give boolean value on whether the list is empty or not.
		
		employeeList.set(1, new Employee("Ron", "Adams", 2256)); // Will replace the employee at index 1 with the entered employee.
		employeeList.forEach(employee -> System.out.println(employee));
		
		System.out.println(employeeList.size()); // Will give us the no. of items in the list. This is not capacity.
		
		employeeList.add(3, new Employee("John", "Doe", 456)); // Giving index so it will add the new entry at this index not in end.
		// If we do not give index & just add any data in the list then by default it gets added in the end of the list.
		// Adding with index has the time complexity of O(n) linear in the worst case scenario as it has to shift the data to make space for new entry.
		
		//employeeList.forEach(employee -> System.out.println(employee));
		
		Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
		for(Employee employee: employeeArray) {
			System.out.println(employee);
		}
		
		System.out.println(employeeList.contains(new Employee("Mary", "Smith", 789)));
		// This will give us False, even though data in the list contains entry of employee Mary Smith. 
		// Because we did not implement equals method in Employee class. There is a difference in the 2 instance created for the Employee in the list. 
		// Thus we've to use equal method in Employee class.
		
		System.out.println(employeeList.indexOf(new Employee("John", "Doe", 456)));
		// This will give the index of the Employee.
		
		employeeList.remove(2); // Will remove the employee at index 2.
		employeeList.forEach(employee -> System.out.println(employee));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
