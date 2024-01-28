package Lecture46_Bit_Masking;

public class Subsequence_Using_BitMasking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		PrintSubSequence(s);				

	}
	// Function to print subsequence
	public static void PrintSubSequence(String s) {
		int len = s.length();
		for(int i=0; i< (1 << len); i++) {
			PrintPattern(s, i);					// Calling function
		}
	}
	public static void PrintPattern(String s, int i) {
		int pos = 0;
		while(i > 0) {
			if((i & 1) != 0) {
				System.out.print(s.charAt(pos));
			}
			pos++;
			i >>= 1;					
		}
		System.out.println();
		
	}

}
