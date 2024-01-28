package Lecture16;

public class Print_Substring_Length {

	public static void main(String[] args) {
		// TODO Print substring length wise
		String Str = "Hello";
		
		Print_Substring(Str);
	}
	public static void Print_Substring(String Str) {
		
		for(int len=1; len<=Str.length(); len++) {
			for(int j = len; j<=Str.length(); j++) {
				int i = j-len;							
				System.out.println(Str.substring(i,j));
			}
			System.out.println();
		}
	}

}
