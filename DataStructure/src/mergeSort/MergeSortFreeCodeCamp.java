package mergeSort;

public class MergeSortFreeCodeCamp {
	
	public static void main(String[] args) {
		int[] array = new int[] {-5, 20, 10, 15, 3, 7, 2, 0};
		mergeSort(array, 0, array.length - 1);
		
		for(int i=0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void mergeSort(int[] array, int start, int end) {
		if(start < end) {
			int mid = (start + end)/2;
			mergeSort(array, start, mid);
			mergeSort(array, mid+1, end);
			merge(array, start, mid, end);
		}
	}
	
	public static void merge(int[] array, int start, int mid, int end) {
		// building temporary array to avoid modifying the original contents
		
		int[] temp = new int[end - start + 1];
		
		int i = start, j = mid +1, k =0;
		
		// While both sub-arrays have values, then try and merge them in sorted order
		
		// i is for the left sub-array which will be till mid point i.e. why i<=mid
		// j is for right sub-array which will be from mid to end i.e. why j<=end
		
		while(i <= mid && j <= end) {
			if(array[i] <= array[j]) {
				temp[k] = array[i];
				k++;
				i++;
			}
			else {
				temp[k] = array[j];
				k++;
				j++;
			}
		}
		
		// In some case, we run out of elements in left sub-array and all that is remaining is right sub-array or vice versa
		// And we just blindly place all the elements of right/left sub-array into the original array
		// Our code should also handle or deal with this kind of case
		
		// Add the rest of the values from left sub-array into the result
		while(i<=mid) {
			temp[k] = array[i];
			k++; i++;
		}
		
		// Add the rest of the values from right sub-array into the result
		while(j <= end) {
			temp[k] = array[j];
			k++; j++;
		}
		
		// Overriding values in the original array with the values of sorted & merged sub-array
		for(i= start; i <= end; i++) {
			array[i] = temp[i - start];
		}
		
	}

}
