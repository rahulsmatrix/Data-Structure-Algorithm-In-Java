package quickSort;

public class QuickSortCodeFromWeb {
	
	public static void main(String[] args) {
		int[] array = {20, 35, -15, 7, 55, 1, -22};
		
		quickSort(array, 0, array.length -1);
		
		for(int i=0; i< array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void quickSort(int[] arr, int start, int end) {
		if(start < end) {
			int partitionIndex = partition(arr, start, end);
			
			quickSort(arr, start, partitionIndex - 1);
			quickSort(arr, partitionIndex + 1, end);
		}
	}
	
	// {20, 35, -15, 7, 55, 1, -22}
	
	public static int partition(int[] arr, int start, int end) {
		// In this code we are taking the last element of array as the pivot
		
		int pivot = arr[end];
		int i = (start - 1);
		
		for(int j = start; j < end; j++) {
			if(arr[j] <= pivot) {
				i++;
				
				int swapTemp = arr[i];
				arr[i] = arr[j];
				arr[j] = swapTemp;
			}
		}
		
		int swapTemp = arr[i+1];
		arr[i+1] = arr[end];
		arr[end] = swapTemp;
		
		return i+1;
	}

}
