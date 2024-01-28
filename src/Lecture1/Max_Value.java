package Lecture1;

public class Max_Value {

	public static void main(String[] args) {
		// Find the max value between three numbers a,b,c
		// int a = 5,b = 8, b = 8; \defining in single line
		int a = 5;
		int b = 8;
		int c = 2;
				
		if(a>=b && a>=c) {
			System.out.println("Max value " + a);
		}
		else if(b>=a && b>=c) {
			System.out.println("Max value " + b);
		}
		else{
			System.out.println("Max value " + c);
		}
		
		// Grade card represent by marks
		
		int m = 56;
		
		if(m>=75) {
			System.out.println("Grade A");
		}
		else if(m>=65 && b<75) {
			System.out.println("Grade B");
		}
		else if(m>=55 && b<65) {
			System.out.println("Grade C");
		}
		else if(m>=45 && b<55) {
			System.out.println("PASS");
		}
		else{
			System.out.println("FAIL");
		}
		
	}

}
