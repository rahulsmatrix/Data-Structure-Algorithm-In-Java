package randomPractice;

public class CalculatingProbability {
	
	public static void main(String[] args) {
		
		System.out.println("Probability of this event is : " + probability(10, 3200000));
		
	}
	
	public static float probability(float f, float n) {
		float p = f/n;
		
		return p;
	}
	

}
