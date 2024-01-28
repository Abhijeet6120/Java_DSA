package Lecture23_Recursion_6;

public class Coin_Combination {

	public static void main(String[] args) {
		// TODO Coin combination
		int[] coin = {2,3,5};						// Infinite coin of 2,3,5
		int amount = 10;
		 
		combination(coin, amount,"", 0);
	}
	
	public static void combination(int[] coin, int amount, String ans, int idx){
		
		if(amount==0) {
			System.out.println(ans+" ");
			return;
		}
		
		for(int i=idx; i<coin.length; i++) {
			
			if(amount >= coin[i]) {					// checking if amount ge coin[i]
				
				combination(coin, amount - coin[i], ans + coin[i], i);
			}
		}
	}

}

