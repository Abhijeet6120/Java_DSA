package Lecture4;

import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// Code for n =7 
		int row = 1;
		int space= 1;
		int star = n/2;
		while(row<=n) {
			// Loop for star
			int i = 1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			
			// Loop for space
			int j = 1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			// Loop for star
			int k = 1;
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			if(row<=n/2) {
				space+=2;
				star--;
			}
			else {
				space-=2;
				star++;
			}
			row++;
			System.out.println();
			
		}
	}

}
