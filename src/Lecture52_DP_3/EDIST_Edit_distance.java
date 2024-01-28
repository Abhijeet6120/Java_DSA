package Lecture52_DP_3;

public class EDIST_Edit_distance {
	// SPOJ: EDIST - Edit distance

	public static void main(String[] args) {
		// 
		String s = "FOOD";
		String t = "MONEY";
		System.out.println(min_Operation(s,t,0,0));

	}

	public static int min_Operation(String s, String t, int i, int j) {
		
		if(i == s.length()) {			// Base Case
			return t.length()-j;
		}
		if(j == t.length()) {
			return s.length()-i;
		}
		int min = 0;
		if(s.charAt(i) == t.charAt(j)) {
			min = min_Operation(s, t, i+1, j+1);
		}
		else {
			int D = min_Operation(s,t,i+1, j);					// Delete opertion
			int R = min_Operation(s, t, i+1, j+1);			// Replace opertion
			int I = min_Operation(s, t, i, j+1);			// Insert opertion
			
			min = Math.min(R, Math.min(D, I));		// min operation find
		}
		return min;
	}

}
