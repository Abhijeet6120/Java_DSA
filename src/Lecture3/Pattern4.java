package Lecture3;

public class Pattern4 {

	public static void main(String[] args) {
		// Flip Triangle 
		int n = 5;
		int row = 1;
		int star = 1;
		int space = n-1;
		while(row<=n) {
			// Space Loop
			int i = 1;
			while(i<=space) {
				System.out.print("  "); // Using double space for better look and fill
				i++;
			}

			// Star Loop
			int j=1;
			while(j<=star) {
				System.out.print("* "); 
				j++;
			}
			// Next Line preparation
			System.out.println();
			row++;
			star++;     // Increasing Star
			space--;   // decreasing space 
		}
	}
}
