package Lecture20_Recursion_3;

import java.util.*;

public class Generate_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 3;										// no. of parenthesis
		List<String> list = new ArrayList<>();			// Creating dynamic array 
		generateParentheses(n,0,0,"",list);				// Calling function
		System.out.println(list);

	}
	// Function to generate parenthesis
	public static void generateParentheses(int n, int open, int close, String ans, List<String> list) {
		// Base case
		if(open == n && close == n) {			// Base case
//			System.out.print(ans+" ");
			list.add(ans);
			return;
		}
		// if open bracket < input then print open bracket'('
		if(open < n) {
			generateParentheses(n,open+1, close, ans+"(", list);
		}
//		if close bracket less than open then print close bracket')'
		if(close < open) {
			generateParentheses(n,open, close+1, ans+")",list);
		}
	}

}
