package Lecture3;

import java.util.*;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int space=n-1;
		int row = 1;
		int star = 1;
		while(row<=2*n-1) {
			// Loop for space
			int j = 1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			// Loop for Star
			int i = 1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			// Mirroring Concept to decrease star and increasing space
			if (row<n) {
				star++;
				space--;
			}
			else {
				star--;
				space++;
			}
			System.out.println();
			row++;
		}

	}

}
