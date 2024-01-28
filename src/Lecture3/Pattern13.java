package Lecture3;
import java.util.*;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int row = 1;
		int star = 1;
		while(row<=2*n-1) {
			// Loop for Star
			int i = 1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			// Mirroring Concept to decrease star
			if (row<n) {
				star++;
			}
			else {
				star--;
			}
			System.out.println();
			row++;
			
		}
		

	}

}
