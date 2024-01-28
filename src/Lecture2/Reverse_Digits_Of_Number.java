package Lecture2;

public class Reverse_Digits_Of_Number {

	public static void main(String[] args) {
		// Reverse of digit
		int n = 4368;
		
		
//*********** 1st method**************
		while (n > 0) {
			int rem = n % 10;
			System.out.print(rem);
			n = n / 10;
		}
		 //N= 4368==>436==>43==>4==>0

// ************2nd method********************
		int rev = 0;
		while (n > 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}

		System.out.print(rev);

		// N= 4368==>436==>43==>4==>0
	}

}
