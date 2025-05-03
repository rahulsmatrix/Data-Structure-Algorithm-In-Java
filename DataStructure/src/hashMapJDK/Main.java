package hashMapJDK;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 123);
		
		Map<String, Employee> hashMap = new HashMap<String, Employee>();
		
		hashMap.put("Jones", janeJones);
		hashMap.put("Doe", johnDoe);
		hashMap.put("Smith", marySmith);
		
		// If we try to add an employee with a Key which we have already used 
		// then the employee we are adding will replace the existing employee
		// and the put method returns the employee which used to be there.
			
//		Employee employee = hashMap.put("Doe", mikeWilson);	
//		System.out.println(employee);
		
		// If we do not want to replace the existing employee with the same key 
		// then we should use putIfAbsent() method, it will only insert the value if the key is not been used.
		
		hashMap.putIfAbsent("Doe", mikeWilson); // This method returns the value which is currently using this key.
		
		// get() method
		System.out.println(hashMap.get("Smith")); // Will return value marySmith.
		System.out.println(hashMap.get("Someone")); // Will return null as no value is associated with this key.
		
		// remove() method
		System.out.println(hashMap.remove("Jones")); // Returns the value that we remove.
		
		
		System.out.println(hashMap.containsKey("Doe")); 
		System.out.println(hashMap.containsValue(janeJones));
		
		
//		Iterator<Employee> iterator = hashMap.values().iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
		hashMap.forEach((k, v) -> System.out.println("Key = " + k + ", Employee = " + v));
		
		
	}

}
