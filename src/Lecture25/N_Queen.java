package Lecture25;
 
public class N_Queen {

	public static void main(String[] args) {
// TODO Find the possible way to put queen in cell sso that they cant hit each other from all direction
		int n = 4;
		boolean[][] board = new boolean[n][n];
		
		queen_Problem(board, n, 0);					// Calling function
	}
	// Function place queen at their right position
	public static void queen_Problem(boolean[][] board, int n, int row) {
		if(n==0) {
			Display(board);
			System.out.println();
			return;
		}
		
		for(int col=0; col<board.length; col++) {
			if(isItSafe(board, row, col) == true) {			// function to check if we can place queen 
				board[row][col] = true;
				queen_Problem(board, n-1, row+1);
				board[row][col] = false;
				
			}
		}
	}
	// Function to check if it is safe to keep queen in row/cols
	public static boolean isItSafe(boolean[][] board, int row, int col) {
		// Loop for upper side
		for(int r=row; r>=0; r--) {
			if(board[r][col] == true) {
				return false;
			}
		}
		// checking right side diognal
		int r = row;
		int c = col;
		while(r>=0 && c<board.length) {
			if(board[r][c] == true) {
				return false;
			}
			r--;
			c++;
		}
		// Checking left side diognal
		r = row;
		c = col;
		while(r>=0 && c>=0) {
			if(board[r][c] == true) {
				return false;
			}
			r--;
			c--;
		}
		return true;				// if all above are false the will return true
	}

	// Function to display all matrix
	public static void Display(boolean[][] board) {
		
		for(int i=0; i<board.length; i++) {
			for(int j =0; j<board.length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();							// changing line
		}	
	}
}
