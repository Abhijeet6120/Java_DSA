package Lecture13;

public class First_Bad__Version {

	public static void main(String[] args) {
		// TODO First Bad Version Leetcode 278 problem This code will only run on LeetCode not in Eclipse
//		int bad = 4;
		int n = 5;
		System.out.println(firstBadVersion(n));
		
	}
	// Function to find first bad version
	public static int firstBadVersion(int n) {
		int si = 1;
		int ei = n;
		int ans = 0;
		while(si<=ei) {
			int mid = (ei+si)/2;
			if(isBadVersion(mid) == true) {     // When we got first bad version or not
				ans = mid;
				ei = mid-1;     
			}
			else {
				si = mid+1;
			}
		}
		return ans;
	}
	private static boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		return false;
	}

}
