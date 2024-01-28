package Lecture6;

public class Binary_to_Decimal {

	public static void main(String[] args) {
		// Binary to Decimal conversion
		int n = 1011011101;
		int sum = 0;
		int mul = 1;
		while(n>0) {
			int rem = n%10;
			sum = sum + rem*mul;
			n = n/10;
			mul = mul*2;
		}
		System.out.println(sum);
	}

}
