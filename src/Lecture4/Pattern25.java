package Lecture4;

import java.util.Scanner;

public class Pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter Input: ");
		int n = sc.nextInt(); 
		System.out.println(n);
		
		// Triangle pattern
		int val = 1;
		int row=1;
		int star = 1;
		int space=n-1;
		while(row<=n) {
			// Space loop
			int i=1;
			while(i<=space) {
				System.out.print("\t"); // \t == 4 space
				i++;
			}
			// Star Loop
			int j = 1;
			while(j<=star) {
				System.out.print(val+"\t");
				// System.out.print("1 ");
				val++;
				j++;
			}
			row++;
			System.out.println();
			space--;
			star +=2;
		}

	}

}
