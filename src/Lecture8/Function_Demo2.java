package Lecture8;

public class Function_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		int a = 8;
		int z = 7;
		int x = 4;
		// Calling function Can not execute programm without acalling
		Add(a,z);
		System.out.println("Hello");
		int ans = Add1(a,x);
		System.out.println(ans);
		
		System.out.println(sub1(ans,a));
		

	}
	
	public static void Add(int a, int z) {
		int c = a+z;
		sub(c, z);
		System.out.println(c);
	}
	
	public static void sub(int a, int b) {
		int c = a- b;
		System.out.println(c);
	}
	// Return type 
	public static int Add1(int a, int x) {
		int c = a+ x;
		
		return c;
	}
// Sybtracting 
	public static int sub1(int a, int x) {
		int c = a- x;
		
		return c;
	}
	
	

}
