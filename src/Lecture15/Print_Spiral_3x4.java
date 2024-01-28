package Lecture15;

public class Print_Spiral_3x4 {

	public static void main(String[] args) {
		// TODO This will work in different row and col (dont work in in same row/col(4x4, 5x5)
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
				
		Print(arr);
	}
	public static void Print(int[][] arr) {
		int minRow = 0;
		int maxRow = arr.length-1;
		int minCol = 0;
		int maxCol = arr[0].length-1;
		int Total_Element = arr.length*arr[0].length;
		int count = 0;
		while(count<Total_Element) {
			for(int i=minCol; i<=maxCol && count<Total_Element; i++) {     // Loop 1 from min col to max col
				System.out.print(arr[minRow][i]+", ");
				count++;
			}
			minRow++;
			for(int i=minRow; i<=maxRow && count<Total_Element; i++) {     // Loop 2 from max col to max row
				System.out.print(arr[i][maxCol]+", ");
				count++;
			}
			maxCol--;
			for(int i=maxCol; i>=minCol && count<Total_Element; i--) {     // Loop 3 from maxCol to minCol
				System.out.print(arr[maxRow][i]+", ");
				count++;
			}
			maxRow--;
			for(int i=maxRow; i>=minRow && count<Total_Element; i--) {     // Loop 4 from maxRow to minRow
				System.out.print(arr[i][minCol]+", ");
				count++;
			}
			minCol++;
		}
	}
}
