package Lecture6;

import java.util.Scanner;

public class Decimal_to_Binary {

	public static void main(String[] args) {
		// Conversion of Decimal to Binary 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//		int n = 29;
		
		int sum = 0;
		int mul = 1;
		while(n>0) {
			int rem = n%2;
			sum = sum + rem*mul;
			 n = n/2;
			 mul = mul*10;
		}
		System.out.println(sum);
	}

}
