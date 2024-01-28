package Lecture21_Recursion_4;

public class Permutation {

	public static void main(String[] args) {
		// TODO Print all possible outcome of String
		String ques = "abc";
		String ans = "";
		
		print_Permutation(ques, ans);
	}
	//Function to print permutation of string 
	public static void print_Permutation(String ques, String ans) {
		if(ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		// Loop to visit every character
		for(int i=0; i<ques.length(); i++) {
			String s1 = ques.substring(0,i);
			String s2 = ques.substring(i+1);
			char ch = ques.charAt(i);
			print_Permutation(s1+s2, ans+ch);
		}
	}
}
