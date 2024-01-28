package Lecture13;
import java.util.*;
public class Binary_Search {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
//		int item = sc.nextInt();
		// TODO Three thing will find in Binary search jab tak Start<=end
//		Incident Happend After
//		Incident Happend Before
//		When Happend Incidet
		int[] arr = {2,5,6,8,10,13,14};
		
		int item = 13;
		System.out.println(Search(arr,item));

	}
	public static int Search(int[] arr, int item) {
		int si = 0;
		int ei = arr.length-1;
		while(si<=ei) {
			int mid = (si+ei)/2;
			if(arr[mid]== item) {     
				return mid;
			}
			else if(arr[mid]>item) {   // Incident Happend Before
				ei = mid-1;
			}
			else {
				si = mid+1;    			// Incident Happend After
			}
		}
		return -1;    // Not found incident
	}

}
