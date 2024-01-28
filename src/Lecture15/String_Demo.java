package Lecture15;

public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1 = "Hello";
		String S2 = "Hello";
		String S3 = new String("Hello");
		String S4 = new String("Hello");
		System.out.println(S1 == S3);
		System.out.println(S3 == S4);
		System.out.println(S1 == S2);
		
		System.out.println(S1.length());		// length() method hai
		int[] arr = new int[2];
		System.out.println(arr.length);   // 		length variable hai 
	}

}
