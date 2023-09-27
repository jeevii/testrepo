package assignmentPackage;

public class Factorial {
	public static void main(String[] arg) {
		
		int fact = 1, num= 6;
		
		for(int i=1; i<=num; i++) {
			
			fact = fact*i;
			
		}
		System.out.println(fact);
	}
}
