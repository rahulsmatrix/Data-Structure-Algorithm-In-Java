package recursion;

public class Factorial {
	
	public static void main(String args[]) {
		
		System.out.println(iterativeFactorial(3));
		System.out.println(recursiveFactorial(3));
	}
	
	// 0! = 1
	// 1! = 1 * 0! = 1
	// 2! = 2 * 1! = 2
	// 3! = 3 * 2! = 6
	// 4! = 4 * 3! = 24
	
	// So, - 
	// n! = n * (n-1)!
	
	public static int recursiveFactorial(int num) {
		
		if(num ==0) {
			return 1;
		}
		
		return num * recursiveFactorial(num -1);	
	}
	
	// Above, is a recursive method/function, it will keep calling itself. Every recursive call will wait for it's value in stack memory, 
	// and once they get the answer or value they are waiting for the calls get resolved in LIFO (Last In First Out) manner.
	// That is why if break condition does not get triggered then it will keep calling itself and will give 'stack overflow error'.
	
	public static int iterativeFactorial(int num) {
		
		if(num == 0) {
			return 1;
		}
		
		int factorial = 1;
		
		for(int i=1; i <= num; i++) {
			factorial *= i;
		}
		
		return factorial;
	}

}
