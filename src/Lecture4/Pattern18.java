package Lecture4;
import java.util.*;

public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row=1;
		int star = 1;
		int space=n/2; // space 3 in 1st row 
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
				System.out.print("* ");
				j++;
			}
			if(row<=n/2) {
				space--;
				star +=2;
			}
			else {
				space++;
				star-=2;
			}
			row++;
			System.out.println();
			
		}

	}

}
