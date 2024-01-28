package Lecture23_Recursion_6;
import java.util.*;
public class Combination_Sum_LT_39 {

	public static void main(String[] args) {
		// TODO 1D List in combination sum
		int[] coin = {2,3,5};						// Infinite coin of 2,3,5
		int amount = 10;
		List<Integer> ll = new ArrayList<>();
		 
		combination(coin, amount, ll, 0);
	}
	
	public static void combination(int[] coin, int amount, List<Integer> ll, int idx){
		
		if(amount==0) {
			System.out.print(ll+" ");
			return;
		}
		
		for(int i=idx; i<coin.length; i++) {
			
			if(amount >= coin[i]) {					// checking if amount ge coin[i]
				ll.add(coin[i]);
				combination(coin, amount - coin[i],ll , i);
				ll.remove(ll.size() -1);
			}
		}
	}
	
	
}
