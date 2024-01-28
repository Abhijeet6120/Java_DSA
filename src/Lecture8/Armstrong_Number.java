package Lecture8;

import java.util.*;

public class Armstrong_Number {

	public static void main(String[] args) {
		// A positive integer of n digits is called an Armstrong number of order n (order is number of digits)
		//1634 is an Armstrong number as 1634 = 1^4 + 6^4 + 3^4 + 4^4
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		System.out.println(Count_of_Digits(n));   // Count the number
		System.out.println(Armstong(n));
	}
	
	public static boolean Armstong(int n) {
		int c = Count_of_Digits(n); // Using total no. of digits
		int p = n;            // Storing n in other var to compare with sum  
		int sum = 0;
		while(n>0) {
			int rem = n % 10;
			sum = (int)(sum + Math.pow(rem, c));
			n = n/10;
		}
		return sum==p; // Direct return
//		if(sum==p) {
//			return true;
//		}
//		else {
//			return false;
//		}
	}
	
	// To count the digits of number
	public static int Count_of_Digits(int n) {
		int count = 0;
		while(n>0){
			count++;
			n = n/10; // n = n/=10
		}
		return count;
	}
	
}
