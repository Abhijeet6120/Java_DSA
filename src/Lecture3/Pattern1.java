package Lecture3;

public class Pattern1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int n =3;
		int row = 1;
		int star = n;
		while(row<=n) {
			// print * for n times
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			// staring new line of row
			System.out.println();
			row++;
		}

	}

}
