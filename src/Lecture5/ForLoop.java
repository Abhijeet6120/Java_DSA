package Lecture5;

public class ForLoop {

	public static void main(String[] args) {
		// Syntax of For loop
		
		for(int i=0;i<=5;i++) {
			System.out.println(i); 
		}
		
		for(int i=1;i<=5;) {
			System.out.println("*");
			i++;
		}
		// Second Method to define for loop
		int i = 0;
		for(; i<5;i++) {
			System.out.println(i);
		}
	
		int j = 0;
		for(;j<=5;) {
			System.out.println(j);
			j++;
		}
		
		

	}

}
