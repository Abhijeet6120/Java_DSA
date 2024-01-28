package Lecture19_Recursion_2;

public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
//		String ans = "";
		
		Print_Subsequence(ques,"");		// taking ans as blank string (ans = "";)

	}
	public static void Print_Subsequence(String ques, String ans) {
		
		if(ques.length() == 0) {				// Base case(Termination condition)
			System.out.println(ans);
			return;
		}
		
		char ch = ques.charAt(0);						// First character of String  
		
		Print_Subsequence(ques.substring(1), ans);			// recursive function
		Print_Subsequence(ques.substring(1), ans+ch);
		
	}

}
