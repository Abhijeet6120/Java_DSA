package Lecture22_Recursion_5;

public class Queen_Cobination {

	public static void main(String[] args) {
		// TODO Queen combination
		int n = 4; 	//					 no. of board
		int tq = 2;					// no. of queen dissimilar
//		String ans = ""; 
		boolean[] board = new boolean[n];
		
		combination(board,0, tq, "",0);
	}
	
	public static void combination(boolean[] board, int qpsf, int tq, String ans, int idx) {
		
		if(qpsf == tq) {					// Base case
			System.out.println(ans);
			return;
		}
		
		for(int i=idx; i< board.length; i++) {			// Loop to traverse every element
			
			if(board[i] == false) {					// checking if already sited if NO
				board[i] = true;						// will sit 
				combination(board, qpsf + 1, tq, ans+ "b" + i + "q" + qpsf,i+1);	// recursive call function
				board[i] = false;		// if we donot use then anse will 3, if we use the complete ans we will get 
			}
		}
	}
	// Line 26 m i+1 we are increasing idx value by increasing iteration 2 in recursive call

}
