package Lecture2;

public class Count_Digits {

	public static void main(String[] args) {
		// Count 3 in 36343
		
		int n = 36343;
		int count=0;
		while(n>0) {
			int rem = n%10;
			if(rem==3) {
				count++;
			}
			n = n/10;
		}
		System.out.println(count);
		// N=  4368==>436==>43==>4==>0
		
	}

}
