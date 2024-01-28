package Lecture15;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "nitin";
		System.out.println(isPallindrome(s1));

	}
	public static boolean isPallindrome(String s) {
		int i=0;						// 
		int j = s.length()-1;  			// length of String
		while(i<j) {												// first index less than last 
			if(s.charAt(i) != s.charAt(j)) {				// checking if both are not equal from both side 
				return false;
			}
			i++;			// index increasing
			j--;			// from last decreasing
		}
		return true;			// else true(if all above are false
	}
}
