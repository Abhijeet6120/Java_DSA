package Lecture52_DP_3;

import java.util.Arrays;

public class Valentine_Magic {
	// Valentine Magic Code Skiller = https://codeskiller.codingblocks.com/problems/281
	
	public static void main(String[] args) {
		int []  boys = {2,11,3};
		int[] girls = {5,7,3,2};
		Arrays.sort(boys);
		Arrays.sort(girls);
		
		System.out.println(valentine(boys, girls, 0, 0));
		
	}
	
	public static int valentine(int[] boys, int[] girls, int i, int j) {
		
		if(i == boys.length) {
			return 0;
		}
		
		if(j == girls.length) {
			return 5435378;				// koi v badi value return kar denge
			
		}
		
		int s = Math.abs(boys[i] - girls[j]) + valentine(boys, girls, i+1, j+1);
		int r = valentine(boys, girls, i+1, j);
		
		return Math.min(s, r);
	}
}
