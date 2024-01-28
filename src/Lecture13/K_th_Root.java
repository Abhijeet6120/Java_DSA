package Lecture13;

public class K_th_Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 3;
		int n = 149;
		System.out.println(KthRoot(n, k));

	}
	// 
	public static int KthRoot(int n, int k) {
		int si = 1;                              // Starting number
		int ei = n;								// ending number
		int ans = 0;
		while(si<=ei) {
			int mid = (si+ei)/2;  // 1+49=150/2 =>75    Finding MIddle number
			if(Math.pow(mid,k) <=n) {			// 75*75*75<=149 False then will check in else untill we get true condition
				ans = mid;
				si = mid+1;
			}
			else {
				ei = mid-1;
			}
		}
		return ans;
	}

}
