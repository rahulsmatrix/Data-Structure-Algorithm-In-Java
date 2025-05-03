package heapMax;

public class Main {
	
	public static void main(String args[]) {
		
		Heap heap = new Heap(10);
		
		heap.insert(80);
		heap.insert(75);
		heap.insert(60);
		heap.insert(68);
		heap.insert(55);
		heap.insert(40);
		heap.insert(52);
		heap.insert(67);
		
		heap.printHeap();
		
		// Deleting random nodes using index of the array.
//		heap.delete(1);
//		heap.printHeap();
		
//		heap.delete(5);
//		heap.printHeap();

		// Deleting the root
//		heap.delete(0);
//		heap.printHeap();
		
		// Peeking at the root.
		System.out.println(heap.peek());
		
		// Now, if we delete the root and then print, 
		// the peek() method will show a different root.
		
		heap.delete(0);
		heap.printHeap();
		System.out.println(heap.peek());

	}

}
