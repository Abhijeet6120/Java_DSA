package Lecture2;

public class Sum_Of_Digits {

	public static void main(String[] args) {
		// Sum of Digits 4368
		
		int n = 4368;
		int sum = 0;
		while(n>0) {
			int rem = n%10; 
			sum = sum+ rem; 
			n = n/10;
		}
		// N=  4368==>436==>43==>4==>0
		System.out.println(sum);

	}

}
