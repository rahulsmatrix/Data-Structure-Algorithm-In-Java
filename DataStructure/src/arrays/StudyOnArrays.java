package arrays;

public class StudyOnArrays {
	
	public static void main(String args[]) {
		int[] intArray = new int[7];
		
		intArray[0] = 12;
		intArray[1] = 35;
		intArray[2] = -15;
		intArray[3] = 7;
		intArray[4] = 64;
		intArray[5] = 29;
		intArray[6] = -45;
		
		int index = -1;
		
		for(int i=0; i < intArray.length; i++) {
			if(intArray[i] == 7) {
				index = i;
				break;
			}
		}
		
		System.out.println(" Index = " + index);
	}
	
}
