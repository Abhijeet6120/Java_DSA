package Lecture46_Bit_Masking;

public class Magic_Number {

	public static void main(String[] args) {
		// TODO https://www.geeksforgeeks.org/find-nth-magic-number/
		
		int n = 12;
		int mul = 5;
		int ans = 0;
		while(n > 0) {
			if((n & 1) != 0) {
				ans += mul;
			}
			mul *= 5;
			n >>= 1;
		}
		System.out.println(ans);
	}

}
