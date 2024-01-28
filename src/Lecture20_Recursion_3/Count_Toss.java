package Lecture20_Recursion_3;

public class Count_Toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		System.out.println(Toss_Count(n,""));

	}
	//Function to Counting no. of ways possibility of appearing Head / tail
	public static int Toss_Count(int n, String ans) {
		if(n==0) {											// Base case									
			return 1;
					
		}
				
		int a = Toss_Count(n-1, ans+ "H");				// recursive call function(Adding H)
		int b = Toss_Count(n-1, ans+ "T");				// Adding T
				
		return a+b;		// Total count will return
	}
}
