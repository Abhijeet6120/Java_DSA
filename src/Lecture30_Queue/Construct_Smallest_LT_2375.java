package Lecture30_Queue;
import java.util.*;

public class Construct_Smallest_LT_2375 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "IIIDIDDD";
		
		System.out.println(smallest_Number(s));

	}
	public static String smallest_Number(String s) {
		int[] ans = new int[s.length() + 1];
		Stack<Integer> st = new Stack<>();
		int count = 1;
		for(int i=0; i<=s.length(); i++) {
			if(i == s.length() || s.charAt(i) == 'I') {
				ans[i] = count;
				count++;
				
				while(!st.isEmpty()) {				// not operator(!)
					ans[st.pop()] = count;
					count++;
				} 
			}
			else{
				st.push(i);
			}
		}
		String s1 = "";
		for(int i=0; i<ans.length; i++) {
			s1 = s1 + ans[i];
		}
		return s1;
		
	}

}
