package Lecture23_Recursion_6;

public class Palindrome_Partitioning_LT_131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nitin";
		
		Partitioning(s,"");

	}
	// Function for String Partitioning
	public static void Partitioning(String ques, String ans) {
		
		if(ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for(int i=1; i<=ques.length(); i++) {
			
			String s= ques.substring(0,i);
			if(isPalindrome(s)) {
				Partitioning(ques.substring(i), ans + s + "|");
			}
		}
	}
	// Function to check palindrome strings
	public static boolean isPalindrome(String s) {
		// Checking if palindrome
		int i =0;
		int j = s.length()-1;
		while(i<j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}
}
