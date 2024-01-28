package Lecture45_Sliding_Window;

public class Kartik_Bhaiya_And_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ababababababababababab";
		int k = 2;
		int flipa = MaximumLength(str, k, 'a'); 
		int flipb = MaximumLength(str, k, 'b');
		System.out.println(Math.max(flipa, flipb));
	}

	public static int MaximumLength(String str, int k, char ch) {
		
		int flip = 0;
		int si =0, ei = 0,  ans =0;
		
		while(ei < str.length()) {
			if(str.charAt(si) == ch) {
				flip++;
			}
			
			while( flip > k && si <= ei) {
				if(str.charAt(si) == ch) {
					flip--;
				}
				si++;
			}
			ans = Math.max(ans, (ei-si +1));
			ei++;
		}
		return ans;
	}

}
