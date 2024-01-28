package Lecture3;
import java.util.*;
public class Pattern10 {

	public static void main(String[] args) {
		// Reverse Triangle 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int star = 2*n-1;
		int space = 0;
		while(row<=n) {
			// Space Loop
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			row++;
			space++;
			star-=2;
		}
		
	}

}
