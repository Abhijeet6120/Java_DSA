package Lecture3;

public class Pattern3 {

	public static void main(String[] args) {
		// Triangle pattern
		// 1st Method 
		/*
		int n = 5;
		int row = 1;
		int star = n;
		
		while(row<=star) {
			int i = 1;
			while(i<=row) {
				System.out.print("* ");
				i++;
			}
			// starting next line
			System.out.println();
			row++;
		} */
		
		// Second method
		int n = 5;
		int row = 1;
		int star = 1;
		
		while(row<=n) {
			int i = 1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			// starting next line
			System.out.println();
			row++;
			star++;
		}
	}

}
