package Lecture20_Recursion_3;

public class Static_Variable {
	
	
	static int val= 100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello");
		System.out.println(val);
		System.out.println("Bye");
		fun();
		System.out.println(val);
		
	}

//	public static void fun() {
//		val = val + 5;
//		
//	}
	
	public static void fun() {
		int val = 90;
//		val = val + 5;
		Static_Variable.val = Static_Variable.val + 5;		// Global variable accessing using class
		
		
	}

}
