package Lecture2;

public class Table_Of_Number {

	public static void main(String[] args) {
		// Table of N numbers 
		
		int n = 7;
		int T1=0;
		int i = 1;
		while(i<=10) {
			T1 = n*i;
			// Only Print Value who is not divisible by 4
			if(T1 %4  !=0) {      
				System.out.println(T1);
			}
			i++;
		}
				
	}

}
