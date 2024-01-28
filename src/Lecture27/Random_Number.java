package Lecture27;
import java.util.*;

public class Random_Number {

	public static void main(String[] args) {
		// TODO Generate random number b/w any range 
		 Random r = new Random();				// random inbuilt function
		 int si = 10;				// low value
		 int ei = 100; 				// highest value
		 for(int i=0; i<5; i++) {
			 int item = r.nextInt(ei-si+1)+ si;		// 0 to 91 tak number
			 System.out.println(item+" ");			// Randome generated number
		 }

	}

}
