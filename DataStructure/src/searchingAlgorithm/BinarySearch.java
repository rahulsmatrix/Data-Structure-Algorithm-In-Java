package searchingAlgorithm;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int[] inputArray = {-22, -15, 1, 7, 20, 35, 55};
		
//		System.out.println(iterativeBinarySearch(inputArray, -15));
//		System.out.println(iterativeBinarySearch(inputArray, 35));
//		System.out.println(iterativeBinarySearch(inputArray, 8888));
//		System.out.println(iterativeBinarySearch(inputArray, 1));

		System.out.println(recursiveBinarySearch(inputArray, -15));
		System.out.println(recursiveBinarySearch(inputArray, 35));
		System.out.println(recursiveBinarySearch(inputArray, 8888));
		System.out.println(recursiveBinarySearch(inputArray, 1));

	}
	
//	public static int iterativeBinarySearch(int[] arr, int value) {
//		int start = 0;
//		int end = arr.length;
//		
//		while(start < end) {
//			int midpoint = (start + end)/2;
//			
//			if(arr[midpoint] == value) {
//				return midpoint;
//			}
//			else if (arr[midpoint] > value) {
//				end = midpoint;
//			}
//			else {
//				start = midpoint + 1;
//			}
//		}
//		
//		return -1;
//	}
	
	public static int recursiveBinarySearch(int[] arr, int value) {
		return recursiveBinarySearch(arr, 0, arr.length, value);
	}
	
	public static int recursiveBinarySearch(int[] arr, int start, int end, int value) {
		if(start >= end) {
			return -1;
		}
		
		int midpoint = (start + end)/2;
		
		if(arr[midpoint] == value) {
			return midpoint;
		}
		else if(arr[midpoint] < value){
			return recursiveBinarySearch(arr, midpoint +1, end, value);
		}
		else {
			return recursiveBinarySearch(arr, start, midpoint, value);
		}
	}

}
