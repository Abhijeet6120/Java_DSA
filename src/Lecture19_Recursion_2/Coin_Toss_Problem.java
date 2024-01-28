package Lecture19_Recursion_2;

public class Coin_Toss_Problem {

	public static void main(String[] args) {
		// Print random tossed possibility of coin by throwing 3 coins
		int n = 3;
		// Function calling 
		Toss(n,"");

	}
	// Function to Print all possibility of appearing Head / tail
	public static void Toss(int n, String ans) {
		if(n==0) {											// Base case
			System.out.println(ans+" ");			
			return;
			
		}
		
		Toss(n-1, ans+ "H");				// recursive call function(Adding H)
		Toss(n-1, ans+ "T");				// Adding T
	}
}
