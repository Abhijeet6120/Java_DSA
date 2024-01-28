package Lecture4;
import java.util.*;

public class Pascals_Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int n = sc.nextInt();					// Taking input
		
		int row = 0;
		int star = 1;
		while(row<n) {
			int i = 0;
			int val = 1;
			while(i<star) {
				System.out.print( val +" ");
				val = ((row-i)*val) / (i+1);          
				i++;
			}
			row++;
			System.out.println();
			star++;
		}
		
		/* Pascal Triangle for star 
		int n = 6;
		int row = 1;
		while(row<=n) {
			int i = 1;
			while(i<=row) {
				System.out.print("* ");
				i++;
			}
			row++;
			System.out.println();
		}
		*/
	}

}
