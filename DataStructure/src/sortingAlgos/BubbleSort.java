package sortingAlgos;

public class BubbleSort {
	
	public static void main(String args[]) {
		
		int[] intArray = {20, 35, -15, 7, 55, 1, -22};
		
		for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			for(int i=0; i < lastUnsortedIndex; i++) {
				if(intArray[i] > intArray[i+1]) {
					swap(intArray, i, i+1);
				}
			}
		}
		
		// Above, we have to use 2 nested for loops which gives us Time Complexity of O(n^2) i.e. Quadratic Time Complexity which is worse.
		
		for(int i=0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}
	
	public static void swap(int[] array, int i, int j) {
		if(array[i] == array[j]) {
			return;
		}
		
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}

// Bubble Sort is a stable sort. But if we use ' >= ' in the sorting algo then it will become an unstable sort. 
// But in this particular case when we are only sorting integers, it doesn't really matter whether it's stable or unstable sort.
