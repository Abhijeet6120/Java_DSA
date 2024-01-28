package Lecture46_Bit_Masking;

public class Odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 19;
		
		if((n&1) != 0) {					// Last digit is 1 then odd Number else Even Number
			System.out.println("Odd");
		}
		else {
			System.out.println("Even");
		}
		

	}

}
