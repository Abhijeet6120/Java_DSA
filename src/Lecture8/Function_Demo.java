package Lecture8;

public class Function_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		
		
		// Calling function Can not execute programm without acalling
		add();
		System.out.println("Hello");
	}
	// Adding function
	public static void add() {
		int a = 8;
		int b = 7;
		int c = a + b;
		sub();                // Calling Sub first sub() chalega then c print karega
		System.out.println(c);
	}
	// Subtract function
	public static void sub() {
		int a = 8;
		int b = 7;
		int c = a - b;
		System.out.println(c);
	}
}

//import java.util.*;
//public class Main {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int digit = sc.nextInt();
//    }
//    
//    // Function for replace digits
//    public static int 
//        int sum = 0;
//	    int position = 1;
//	    while(n>0){
//	        int rem = n%10;
//	        if(rem == 0){
//	            rem = 5;
//	        }
//	        sum =(int)(sum+rem*Math.pow(10,position-1));
//	       //sum = sum*10+rem; reverse element
//            n = n/10;
//	        position++;
//	        
//	    }
//		System.out.println(sum);
//    
//}