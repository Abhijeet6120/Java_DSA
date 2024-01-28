package Lecture24;

public class Word_Search_LT_79 {

	public static void main(String[] args) {
		// TODO LeetCode problem 79 Search word
		char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word = "ABCCED";					// Search  thus word in 2D matrix if exit True, else falseff
		
		for(int i=0; i<board.length; i++) {			// For rows
			
			for(int j=0; j<board[0].length; j++) {			// For cols
				if(board[i][j] == word.charAt(0)) {							// Checking if word exist
					boolean ans = word_Search(board, word, 0,0,0);			// Calling function
					if(ans == true) {
						System.out.println(ans);
						return;
					}
				}
			}
		}
		System.out.println(false);

	}
	// Function to search word in matrix					(idx: to track the character of word
	public static boolean  word_Search(char[][] board, String word,int i, int j, int idx) {
		
		if(idx == word.length()) {				// Base case
			return true;
		}
		
		if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j] != word.charAt(idx)) {	// checking if in range
			return false;
		}
		
		board[i][j] = '*';
		// Using for loop if we have multiple direction to check
		int[] r = {-1,1,0,0};
		int[] c = {0,0,-1,1};
		for(int k=0; k<c.length; k++) {
			boolean ans = word_Search(board, word, i+r[k],j+c[k], idx+1);
			if(ans) {
				return true;
			}
		}
			// Here we have manually done fpor each 4 directio
//		boolean a1 = word_Search(board, word, i-1,j, idx+1);				// upside
//		boolean a2 = word_Search(board, word, i+1,j, idx+1);				// Downwards
//		boolean a3 = word_Search(board, word, i,j-1 ,idx+1);				// Left Side
//		boolean a4 = word_Search(board, word, i,j+1, idx+1);				// Right Side
		board[i][j] = word.charAt(idx); 
//		return a1 || a2|| a3|| a4;
		
		return false;
	}
}
