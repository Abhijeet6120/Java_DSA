package Lecture16;

public class Substring_Print {

	public static void main(String[] args) {
		// Print all substring of hello
		String S1 = "Hello";
		
		Print_Substring(S1);
	}
	// Function to print all substring
	public static void Print_Substring(String S1) {
		for(int i=0;i<S1.length(); i++) {					// From starting index
			for(int j=i+1; j<=S1.length(); j++) {			// From next index
				System.out.println(S1.substring(i,j)+" ");
			}
			System.out.println();
		}
	}
}
