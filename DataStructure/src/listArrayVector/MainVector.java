package listArrayVector;

import java.util.List;
import java.util.Vector;

public class MainVector {
	
	public static void main(String[] args) {
				// That's why we instantiated employeeList using List and not ArrayList as we can just redefine it using a different list such as Vector.
				// It's easy to change the specific implementation of list that we're using.
				
				List<Employee> employeeList = new Vector<>(); 
				
				employeeList.add(new Employee("Jane", "Jones", 123));
				employeeList.add(new Employee("John", "Doe", 456));
				employeeList.add(new Employee("Mary", "Smith", 789));
				employeeList.add(new Employee("Mike", "Wilson", 3245));
				
				
				employeeList.forEach(employee -> System.out.println(employee));
				// Used forEach loop with lambda expression. Can also use a for loop but the later is more concise.
				
				System.out.println(employeeList.get(1)); // Will give the second employee, ArrayList is backed by Array thus it's also 0 indexed.
				
				System.out.println(employeeList.isEmpty()); // Will give boolean value on whether the list is empty or not.
				
				employeeList.set(1, new Employee("Ron", "Adams", 2256)); // Will replace the employee at index 1 with the entered employee.
				employeeList.forEach(employee -> System.out.println(employee));
				
				System.out.println(employeeList.size()); // Will give us the no. of items in the list. This is not capacity.
				
				employeeList.add(3, new Employee("John", "Doe", 456)); // Giving index so it will add the new entry at this index not in end.
				
				//employeeList.forEach(employee -> System.out.println(employee));
				
				Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
				for(Employee employee: employeeArray) {
					System.out.println(employee);
				}
				
				System.out.println(employeeList.contains(new Employee("Mary", "Smith", 789)));
				// This will give us False, even though data in the list contains entry of employee Mary Smith. 
				// Because we did not implement equals method in Employee class. There is a difference in the 2 instance created for the Employee in the list. 
				// equals() method helps to see the contents/object of the list. Thus, we've to use equal method in Employee class.
				
				System.out.println(employeeList.indexOf(new Employee("John", "Doe", 456)));
				// This will give the index of the Employee.
				
				employeeList.remove(2); // Will remove the employee at index 2.
				employeeList.forEach(employee -> System.out.println(employee));
	}

}
