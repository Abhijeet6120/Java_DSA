package Lecture22_Recursion_5;

public class Queen_Permutation {

	public static void main(String[] args) {
		// TODO Queen permutation
		int n = 4; 	//					 no. of board
		int tq = 2;					// no. of queen dissimilar	
//		String ans = ""; 
		boolean[] board = new boolean[n];
		
		permutation(board,0, tq, "");
	}
	
	public static void permutation(boolean[] board, int qpsf, int tq, String ans) {
		
		if(qpsf == tq) {					// Base case
			System.out.println(ans);
			return;
		}
		
		for(int i=0; i< board.length; i++) {			// Loop t traverse every element
			
			if(board[i] == false) {					// checking if already sited if NO
				board[i] = true;						// will sit 
				permutation(board, qpsf + 1, tq, ans+ "b" + i + "q" + qpsf);	// recursive call function
				board[i] = false;		// if we donot use then anse will 3, if we use the complete ans we wi;; get 
			}
		}
	}

}
