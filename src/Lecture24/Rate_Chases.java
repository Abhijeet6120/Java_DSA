package Lecture24;
import java.util.*;

public class Rate_Chases {

	public static void main(String[] args) {
		// Rat chase its chase
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		// Taking character input in 2D array
		char[][] arr = new char[n][m];
		for(int i =0; i<arr.length; i++) {						// for rows
			String s = sc.next();
			
			for(int j =0; j<s.length(); j++) {				//For cols
				arr[i][j] = s.charAt(j); 	 
			}
		}
		int[][] ans = new int[n][m];
		mazePath(arr,0,0,ans);
		if(val == false) {
			System.out.println("NO PATH FOUND");
		}
		
	}
	static boolean val = false;				// Global static variable

	public static void mazePath(char[][] arr, int i, int j, int[][] ans) {
		
		if (i == arr.length-1 && j == arr[0].length-1 && arr[i][j] != 'X') {		// Base Case
			ans[i][j] = 1;
			Display(ans);
			val = true;
			return;
		}
		
		if(i<0 || i>=arr.length || j<0 || j>=arr[0].length || arr[i][j] == 'X') {	// This will help to be in range
			return; 
		}
		
		arr[i][j] = 'X';		// blocking visited cell
		ans[i][j] = 1;		// putting 1 in ans matrix
		
		int[] r = {-1,1,0,0};
		int[] c = {0,0,-1,1};
		for(int k=0; k<c.length; k++) {
			mazePath(arr,i+r[k],j+c[k], ans);
		}
		//this can be done by loop for multiple direction(Currently we have done for only 4 direction manually
//		mazePath(arr,i-1,j, ans);				// upside
//		mazePath(arr,i+1,j, ans);				// Downwards
//		mazePath(arr,i,j-1 ,ans);				// Left Side
//		mazePath(arr,i,j+1, ans);				// Right Side
		arr[i][j] = 'O';					// Backtracking unblocking visited cell
		ans[i][j] = 0;
		
	}
	// TODO Display the output
	public static void Display(int[][] ans) {
		
		for(int i=0; i<ans.length; i++) {
			for(int j=0; j<ans[0].length; j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}	
	}
}
