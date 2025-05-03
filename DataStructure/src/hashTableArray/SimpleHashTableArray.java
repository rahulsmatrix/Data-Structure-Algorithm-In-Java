package hashTableArray;

public class SimpleHashTableArray {
	
	private Employee[] hashtable;
	
	public SimpleHashTableArray() {
		hashtable = new Employee[10];
	}
	
	public void put(String key, Employee employee) {
		int hashedKey = hashKey(key);
		if(hashtable[hashedKey] != null) {
			System.out.println("Sorry, there's already an employee at position - " + hashedKey);
		}
		else {
			hashtable[hashedKey] = employee;
		}
	}
	
	public Employee get(String key) {
		int hashedKey = hashKey(key);
		return hashtable[hashedKey];
	}
	
	// Keeping our hashing function private as we don't need expose it. 	
	private int hashKey(String key) {
		
		// Key & hashed value are not same. 
		// Key can be anything, can be of any data type.
		// But hashed value will always be an integer.
		
		// We need to write a good hashing logic, to put values with a unique key.
		// If our hashing function / logic is not good then we will end up assigning multiple values to the same key.
		// This will result in Collision and will make retrieval slow.
		
		return key.length() % hashtable.length;
	}
	
	public void printHashtable() {
		for(int i=0; i< hashtable.length; i++) {
			System.out.println(hashtable[i]);
		}
	}

}
