package Lecture32_OOPs_Inheritance;

public class Client {
	
	public static void main(String[] args) {
		// Case=1
//		P obj = new P();
//		System.out.println(obj.d);
//		System.out.println(obj.d2);
//		obj.fun();
//		obj.fun2();
		
		// Case-2
			
//		P obj = new C();
//		System.out.println(obj.d);		// 1 output
//		System.out.println(obj.d2);		// 2 output
//		System.out.println(((C)(obj)).d1);		// Type cast to access the  C ka vaiable
//		System.out.println(((C)(obj)).d);		// Type cast to access the  C ka vaiable
//		
//		obj.fun();	// Auto updating fun method as per the client requirement
//		obj.fun2();
//		((C)(obj)).fun1();
		
		// Case = 3
		
//		C obj = new P();// Not allowed to do this types of inheritance
		
		// Case-4
		
		C obj  = new C();
		System.out.println(obj.d);		// 1 output
		System.out.println(obj.d1);		// 2 output
		System.out.println(obj.d1);		
		System.out.println(((P)(obj)).d);	// Type cast to access the  C ka vaiable
		
		obj.fun();
		obj.fun1();
		obj.fun2();
		
		
	}

}
