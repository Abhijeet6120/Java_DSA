package Lecture4;

import java.util.*;

public class Pattern28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int val = 1;
		int row=1;
		int star = 1;
		int space=n-1; // space 3 in 1st row 
		while(row<=n) {  // For rhombus shape(Mirror of this pattern) use n= 2*n-1
			// Space loop
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			// Star Loop
			int j = 1;
			int p = val;
			while(j<=star) {
				System.out.print(p+ " ");
				// System.out.print("1 ");
				if(j<=star/2) {   // Condition for left side mirroring
					p++;
				}
				else {
					p--;
				}
				j++;
			}
			// Conditions for upper side star only
			if(row<n) {
				space--;
				star +=2;
				val++;
			}
//			else {
//				space++;
//				star-=2;
//				val--;
//			}
			row++;
			System.out.println();
			
			
		}

	}

}
