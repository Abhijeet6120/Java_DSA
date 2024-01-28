package Lecture46_Bit_Masking;

public class CountSet_Bit {

	public static void main(String[] args) {
		// Set bit
		int n = 107;
		
		System.out.println(countSetBit(n));
		System.out.println(countSetBit_Fast(n));
	}
	
	// Fast(TC-O(1)
		public static int countSetBit_Fast(int n) {
			int count = 0;
			while(n != 0) {					// jab tak n==0 nhi h
				n = n & (n-1); 
					count++;
				n >>= 1;	// n = n >> 1
			}
			return count;
		}
		
	// SlowTC-O(1)
	public static int countSetBit(int n) {
		int count = 0;
		while(n != 0) {
			if((n & 1) != 0) {
				count++;
			}
			n >>= 1;	// n = n >> 1
		}
		return (count);
	}

}
