package Lecture7;
import java.util.*;

public class Fahrenheit_to_Celsius {

	public static void main(String[] args) {
		// TODO Fahrenheit to Celsius conversion
		Scanner sc = new Scanner(System.in);
		int minF = sc.nextInt();
		int maxF = sc.nextInt();
		int steps = sc.nextInt();

		for(int F = minF; F<=maxF;F=F+steps) {
			int C = (int)((5.0/9) * (F-32));  // Type casting to get value into integer
			System.out.println(F + "\t"+ C);
		}
		sc.close();
	}
	

}
