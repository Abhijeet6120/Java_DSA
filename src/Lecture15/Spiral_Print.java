package Lecture15;

public class Spiral_Print {

	public static void main(String[] args) {
		// TODO This will work in same row and same col (dont work in in different row/col)
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		Print(arr);
	}
	public static void Print(int[][] arr) {
		int minRow = 0;
		int maxRow = arr.length-1;
		int minCol = 0;
		int maxCol = arr[0].length-1;
		
		while(minRow<=maxRow && minCol<=maxCol) {
			
		
			for(int i=minCol ;i<=maxCol; i++) {     // Loop 1 from min col to max col
				System.out.print(arr[minRow][i]+" ");
			}
			minRow++;
			for(int i=minRow ;i<=maxRow; i++) {     // Loop 2 from max col to max row
				System.out.print(arr[i][maxCol]+" ");
			}
			maxCol--;
			for(int i=maxCol ;i>=minCol; i--) {     // Loop 3 from maxCol to minCol
				System.out.print(arr[maxRow][i]+" ");
			}
			maxRow--;
			for(int i=maxRow; i>=minRow; i--) {     // Loop 4 from maxRow to minRow
				System.out.print(arr[i][minCol]+" ");
			}
			minCol++;
		}
		
	}
	

}
