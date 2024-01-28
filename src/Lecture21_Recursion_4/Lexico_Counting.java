package Lecture21_Recursion_4;

public class Lexico_Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;
		Counting(n,0);

	}
	// 
	public static void Counting(int n, int curr) {
	
		if(curr > n) {							// Base case
			return;
		}
		System.out.println(curr);				// Print counting
		
		int i=0;
		if(curr == 0) {			// if curr=0 the loop will, run from1 else 0 to 9 will run
			i = 1;
		}
		for(; i<=9; i++) {
			Counting(n,curr * 10 + i);
		}
	}

}
