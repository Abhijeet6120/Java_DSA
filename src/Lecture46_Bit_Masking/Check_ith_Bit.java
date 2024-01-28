package Lecture46_Bit_Masking;

public class Check_ith_Bit {

	public static void main(String[] args) {
		// TChech if 3rd position bit is Set='1' or UnSet='0'
		
		int n = 68;
		int i = 3;					// Position
		int mask = (1<<i);		// mask is variable
		if((n & mask) != 0) {
			System.out.println("Already Set hai Try nhi karo");
		}
		else {
			System.out.println("Set nahi hai Try karo");
		}

	}

}
