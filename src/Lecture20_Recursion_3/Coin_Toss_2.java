package Lecture20_Recursion_3;

public class Coin_Toss_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
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
		// Checking if length ==0 or next char not equal to H
		if(ans.length() == 0 || ans.charAt(ans.length()-1) != 'H') {
			Toss(n-1, ans+ "H");					// recursive call function(Adding H)
		}
						
		Toss(n-1, ans+ "T");				// Adding T(This is always add T)
	}
}
