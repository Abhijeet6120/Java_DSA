package Lecture3;

import java.util.Scanner;

public class Patern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter Input: ");
		int n = sc.nextInt(); 
		System.out.println(n);
		
		// Triangle pattern
		int row=1;
		int star = 1; 
		int space=n-1;    
		while(row<=n) {
			// Space loop
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			// Star Loop
			int j = 1;
			while(j<=star) {
				if(j%2==0) {
					System.out.print("! ");
				}
				else {
					System.out.print("* ");
				}
				j++;
			}
			row++;
			System.out.println();
			space--;
			star +=2;
		}


	}

}
