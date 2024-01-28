package Lecture15;

public class String_Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1 = "Hello";
		String S2 = "Bolo";
//		String S3 = S1.concat(S2);   // Concatenation of String
		
		String S3 = S1+S2;
		System.out.println(S3);
		
		S1 = S1+"Hello";
		String S4 = "Hello"+"byte";
		System.out.println(S4.charAt(4));
		
	}

}
