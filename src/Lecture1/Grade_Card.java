package Lecture1;

public class Grade_Card {

	public static void main(String[] args) {

		// Grade card represent by marks
		
		int m = 54;
		
		if(m>=75) {
			System.out.println("Grade A");
		}
		else if(m>=65 && m<75) {
			System.out.println("Grade B");
		}
		else if(m>=55 && m<65) {
			System.out.println("Grade C");
		}
		else if(m>=45 && m<55) {
			System.out.println("PASS");
		}
		else{
			System.out.println("FAIL");
		}
		
		// n divisible by 2 and 3 then print HI, if divisible by 7 then print BYE
		
		int n = 56;
		if(n%2==0 && n%3==0) {
			System.out.println("Hi");
		}
		else if(n%7==0) {
			System.out.println("Bye");
		}
		else {
			System.out.println("Okay");
		}
	}
}
