package Lecture23_Recursion_6;

import java.util.*;

public class Combination_Sum_2D_List_LT_39 {

	public static void main(String[] args) {
		// TODO 
		int[] coin = {2,3,5};						// Infinite coin of 2,3,5
		int amount = 8;
		
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> ll = new ArrayList<>();
		 
		combination(coin, amount, ll,0, ans);
		System.out.println(ans);				// Print ans of all 
	}
	
	public static void combination(int[] coin, int amount, List<Integer> ll, int idx, List<List<Integer>> ans ){
		
		if(amount==0) {
//			System.out.print(ll+" ");
			ans.add(new ArrayList<>(ll));// Creating new list and copy data from ll into ans
			return;
		}
		
		for(int i=idx; i<coin.length; i++) {
			
			if(amount >= coin[i]) {					// checking if amount ge coin[i]
				ll.add(coin[i]);
				combination(coin, amount - coin[i],ll , i,ans);
				ll.remove(ll.size() -1);							// Backtracking
			}
		}
	}
	
	
}
