package Lecture21_Recursion_4;

public class Duplicate_Permutation {

	public static void main(String[] args) {
		// TODO Remove duplicate from permutation
		
		String ques = "abca";
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
			char ch = ques.charAt(i);
			boolean val = true;
			
			for(int j=i+1; j<ques.length(); j++) {
				if(ques.charAt(j) == ch) {				// Checking character if duplicate
					val = false;
					break;
				}
			}
			if(val == true) {							// checking if duplicate character checked
				String s1 = ques.substring(0,i);
				String s2 = ques.substring(i+1);
					
				print_Permutation(s1+s2, ans+ch);
			}
		}
	}
}