package Lecture5;
import java.util.*;

public class GCD {

	public static void main(String[] args) {
		// TO Find the HCF/GCD 
		Scanner sc = new Scanner(System.in);
		int divident = sc.nextInt();				// Dividend input
		int divisor = sc.nextInt();					// Divisor input
		
// NOTE: If divisor is greater than Dividend the reminder will divisor the will start executing GCD
		
//		int divident = 60;
//		int divisor = 36;
		while(divident%divisor !=0) {
			int rem  = divident % divisor;
			divident  = divisor;
			divisor = rem;
		}
		System.out.println(divisor);
	
	}

}
