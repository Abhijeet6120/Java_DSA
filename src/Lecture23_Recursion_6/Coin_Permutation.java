package Lecture23_Recursion_6;

public class Coin_Permutation {

	public static void main(String[] args) {
		// TODO Coin permutation in which amount 
		int[] coin = {2,3,5};						// Infinite coin of 2,3,5
		int amount = 8;
		
		permutation(coin, amount,"");
	}
	
	public static void permutation(int[] coin, int amount, String ans){
		
		if(amount==0) {
			System.out.println(ans+" ");
			return;
			
		}
		
		for(int i=0; i<coin.length; i++) {
			
			if(amount >= coin[i]) {					// checking if amount ge coin[i]
				
				permutation(coin, amount - coin[i], ans + coin[i]);
			}
		}
	}

}

	