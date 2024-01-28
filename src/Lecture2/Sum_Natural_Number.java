package Lecture2;

public class Sum_Natural_Number {

	public static void main(String[] args) {
		// \sum of n natural number
		int n= 10;
		
// Using while loop		
		int sum = 0;
		int i = 0;
		while(i<=n){
			sum = sum +i;
			i++;
		}
		System.out.println(sum);
		
// Using for loop
		int sum2 = 0;
		for(i=0; i<=n; i++) {
			sum2 += i;
		}
		System.out.println(sum2);
	}

}
