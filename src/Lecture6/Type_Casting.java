package Lecture6;
import java.util.*;
public class Type_Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		byte b = (byte)(135);
		int a =10;
		short s = 10;
		long l = 10000000000L;
		System.out.println(b);
		b = 6;  // Implicit 
		a = b;	// Exlicit 
		System.out.println(a);
		
		// Taking input in any data type 
		a = sc.nextInt();
		l = sc.nextLong();
		b = sc.nextByte();
		s = sc.nextShort();
		
		boolean m = true;
		boolean n = false;
		m = sc.nextBoolean();
		
	}

}
