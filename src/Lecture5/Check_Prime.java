package Lecture5;
import java.util.*;

public class Check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count= 0;
		for(int i=2;i<=n-1;i++) {    // i<n or i<=n-1
			if(n%i==0) {
				count++;
			}
		}
		if(count>=1) {
			System.out.println("Not Prime Number");
		}
		else {
			System.out.println("Prime NUmber");
		}
		sc.close();

	}


}



