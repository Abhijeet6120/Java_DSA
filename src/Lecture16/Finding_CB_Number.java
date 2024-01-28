package Lecture16;
import java.util.*;

public class Finding_CB_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();					// Size of input
		String s = sc.next();					// input string
//		String s = "76718127";   					// Hard code input
		
		System.out.println(CountCBNumber(s));				// Called function

	}
	// Function to count the CB number length wise
	public static int CountCBNumber(String str) {
		// Below code is for print substring length wise
		int count=0;
		boolean[] visited = new boolean[str.length()];
		for(int len=1; len<=str.length(); len++) {
			for(int j = len; j<=str.length(); j++) {
				int i = j-len;							
				String s = str.substring(i, j);
				long n = Long.parseLong(s);							// Conversion string to integer
				if(IsCBNumber(n)== true && isValid(visited,i,j-1) == true) {
					count++;
					// Loop if not involve in any number
					for(int k=i; k<j; k++) {
						visited[k] = true;
					}
				}
			}
		}
		return count;
	}
	// Function to check if visited or not
	public static boolean isValid(boolean[] visited, int i, int j) {
		// TODO Auto-generated method stub
		for(; i<=j; i++) {
			if(visited[i] == true) {
				return false;
			}
		}
		return true;
	}
	// Function to check CB number
	public static boolean IsCBNumber(long n) {
		if(n==0 || n==1) {
			return false;
		}
		int[] arr = {2,3,5,7,11,13,17,19,23,29};
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == n) {
				return true;
			}	
		}
		for(int i=0;i<arr.length;i++) {
			if(n % arr[i] == 0) {
				return false;
			}
		}
		return true;
	}
}
