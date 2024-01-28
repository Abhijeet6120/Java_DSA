package Lecture13;

import java.util.*;

public class Aggressive_Cows {

	public static void main(String[] args) {
		// TODO SPOJ problem Aggressive Cows
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t>0) {
			int n = sc.nextInt();
			int c = sc.nextInt();
			int[] stall = new int[n];
			for(int i=0;i<stall.length;i++) {
				stall[i] = sc.nextInt();
			}
		
			Arrays.sort(stall);  // Using inbuilt method to sort the stall
			System.out.println(MaximumDistance(stall, c));
			t--;
		}
	}
	public static int MaximumDistance(int[] stall, int c) {
		
		int si = stall[0];
		int ei = stall[stall.length-1];
		int ans = 0;
		while(si<=ei) {
			int mid = si+(ei-si)/2;
			if(isitPossible(stall, mid,c) == true) {   // API inbuilt function provide compiler
				ans = mid;
				si = mid+1;
			}
			else {
				ei = mid-1;
			}
		}
		return ans;
	}
	// API inbuilt function provide compiler(But Here we are creating function in eclipse as it does not haver 
	public static boolean isitPossible(int[] stall, int mid, int c) {
		
		int pos = stall[0]; 
		int cow = 1;
		for(int i=0;i<stall.length;i++) {
			if(stall[i] - pos>= mid) {
				cow++;
				pos = stall[i];
			}
			if(cow==c) {
				return true;
			}
		}
		return false;
	}
	

}
