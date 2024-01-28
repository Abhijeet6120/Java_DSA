package Lecture19_Recursion_2;

public class Subsequence_Count {
	
	static int count = 0;						// static variable(Global variable)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stubString ques = "abc";
		String ques = "abc";
//		String ans = "";
		// for 1st method
		Print_Subsequence(ques,"");		// taking ans as blank string (ans = "";)
		System.out.println(count);		// 1st subsequence is blank string
		
		// 2nd method
		
		System.out.print(Print_Subsequence2(ques,""));
		
	}
	// 1st Method to count subsequence
	public static void Print_Subsequence(String ques, String ans) {
		
		if(ques.length() == 0) {				// Base case(Termination condition)
			System.out.println(ans);
			count++;
			return;
		}
		
		char ch = ques.charAt(0);						// First character of String  
		
		Print_Subsequence(ques.substring(1), ans);			// recursive function
		Print_Subsequence(ques.substring(1), ans+ch);
		
	}
	
	// 2nd Method to count subsequence without using static variable
		public static int Print_Subsequence2(String ques, String ans) {
			
			if(ques.length() == 0) {				// Base case(Termination condition)
				System.out.print(ans+" ");
				
				return 1;
			}
			
			char ch = ques.charAt(0);						// First character of String  
			
			int f1 = Print_Subsequence2(ques.substring(1), ans);			// recursive function
			int f2 = Print_Subsequence2(ques.substring(1), ans+ch);
			
			return f1+f2;			// adding total count of both f1/f2
			
		}

}
