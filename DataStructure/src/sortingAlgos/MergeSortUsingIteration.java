package sortingAlgos;

public class MergeSortUsingIteration {
	
	// This code works but not efficient at all. 
	
	public static void main (String args[]) {
		int[] intArray = {20, 35, -15, 7, 55, 1, -22};
		int size = intArray.length;
		mergeSort(intArray, size);
		
		for(int i=0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}
	
	public static void mergeSort(int[] array, int length) {
		if(length < 2) {
			return;
		}
		
		int mid = length/2;
		int[] leftArray = new int[mid];
		int[] rightArray = new int[length - mid];
		
		for(int i =0; i <mid; i++) {
			leftArray[i] = array[i];
		}
		
		for(int i = mid; i<length; i++) {
			rightArray[i - mid] = array[i];
		}
		
		mergeSort(leftArray, mid);
		mergeSort(rightArray, length - mid);
		
		merge(array, leftArray, rightArray, mid, length - mid);
		
	}
	
	public static void merge(int[] array, int[] leftSubArray, int[] rightSubArray, int left, int right) {
		int i =0, j =0, k =0;
		
		while(i < left && j < right) {
			if(leftSubArray[i] <= rightSubArray[j]) {
				array[k++] = leftSubArray[i++];
			}
			else {
				array[k++] = rightSubArray[j++];
			}	
		}
		
		while(i < left) {
			array[k++] = leftSubArray[i++];
		}
		
		while(j < right) {
			array[k++] = rightSubArray[j++];
		}
		
	}

}
