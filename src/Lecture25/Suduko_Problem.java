package Lecture25;

public class Suduko_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{ 3, 0, 6, 5, 0, 8, 4, 0, 0 }, 
						{ 5, 2, 0, 0, 0, 0, 0, 0, 0 }, 
						{ 0, 8, 7, 0, 0, 0, 0, 3, 1 },
						{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, 
						{ 9, 0, 0, 8, 6, 3, 0, 0, 5 }, 
						{ 0, 5, 0, 0, 9, 0, 6, 0, 0 },
						{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, 
						{ 0, 0, 0, 0, 0, 0, 0, 7, 4 }, 
						{ 0, 0, 5, 2, 0, 6, 3, 0, 0 }};

		sudoku_Solver(grid, 0, 0);

	}

	public static void sudoku_Solver(int[][] grid, int row, int col ) {
		// TODO Auto-generated method stub
		if(col==9) {
			row++;
			col=0;
		}
		if(row==9) {
			Display(grid);
			return;
		}
		
		if(grid[row][col] !=0) {
			sudoku_Solver(grid, row, col+1);
		}
		else {
			for(int val=1; val <=9; val++) {
				if(isItSafe(grid, row, col, val)) {
					grid[row][col] = val;
					sudoku_Solver(grid, row, col+1);
					grid[row][col] = 0;
				}
			}
		}
		
	}

	// Function to check if it is safe to keep number
	public static boolean isItSafe(int[][] grid, int row, int col, int val) {
		
		// for rows
		for(int c=0; c<9; c++) {
			if(grid[row][c] == val) {
				return false;
			}
		}
		// for cols
		for(int r=0; r<9; r++) {
			if(grid[r][col] == val) {
				return false; 
			}
		}
		
		// For 3*3 matrix		for inside 3x3 matrix 
		int r = row - row%3;
		int c = col - col%3;
		for(int i=r; i<r+3; i++) {
			for(int j=c; j<c+3; j++) {
				if(grid[i][j] == val) {
					return false;
				}
			}
		}
		return true;
	}
	// Function to display matrix
	private static void Display(int[][] grid) {
		
		for(int i=0; i<grid.length; i++) {
			for(int j =0; j<grid.length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();							// changing line
		}	
		
	}

}
