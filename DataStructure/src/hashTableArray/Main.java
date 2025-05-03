package hashTableArray;

public class Main {
	
	public static void main(String[] args) {
		
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 789);
		
		SimpleHashTableArray hash = new SimpleHashTableArray();
		
		hash.put("Jones", janeJones);
		hash.put("Doe", johnDoe);
		hash.put("Smith", marySmith);
		hash.put("Wilson", mikeWilson);
		
//		hash.printHashtable();
		
		System.out.println("Retrieve key Wilson" + hash.get("Wilson"));
	}

}
