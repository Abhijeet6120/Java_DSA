package Lecture14;

import java.util.Scanner;

public class Input_And_Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];   // Taking input in 2D array
		for(int i=0;i<arr.length;i++) {  // i = row
			for(int j=0;j<arr[0].length;j++) {   //j = col 
				arr[i][j] = sc.nextInt();
//				System.out.println(arr[i][j]+" ");   // we can print here as well 
			}
		}
		Display(arr);
	}
	// Function to print all 2d array we do not need to create function to print 2d array  
	public static void Display(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
