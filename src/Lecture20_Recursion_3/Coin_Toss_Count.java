package Lecture20_Recursion_3;

public class Coin_Toss_Count {
	
	static int count = 0;				// Global variable defining 

	public static void main(String[] args) {
		// to print total no. of ways(count)
		int n = 3;
		Toss(n,"");
		System.out.println(count);

	}
	// Function to Print all possibility of appearing Head / tail
		public static void Toss(int n, String ans) {
			if(n==0) {											// Base case
				System.out.println(ans+" ");	
				count++;						// Counting no. of ways 
				return;
			}
			
			Toss(n-1, ans+ "H");				// recursive call function(Adding H)
			Toss(n-1, ans+ "T");				// Adding T
		}

		//Function to Counting no. of Toss possibility of appearing Head / tail
		public static int Toss_Count(int n, String ans) {
			
			if(n==0) {									// Base case
				System.out.println(ans+" ");						
				return count;
			}
			
			int a = Toss_Count(n-1, ans+ "H");				// recursive call function(Adding H)
			int b = Toss_Count(n-1, ans+ "T");				// Adding T
			
			return a+b;		// Total count will return
		}
	}
