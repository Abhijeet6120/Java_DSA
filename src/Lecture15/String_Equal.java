package Lecture15;

public class String_Equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hey";
//		String s2 = "hi";
		String s2 = new String("baby");
//		String s2 = new String("hi");
//		System.out.println(s1.equals(s2));
		System.out.println(equal(s1,s2));	
	}
	public static boolean equal(String s1, String s2) {

		if(s1==s2) {
			return true;
		}
		else if(s1.length() != s2.length()){			// checking length of both s1 and s2
			return false;
		}
		else {
			for(int i=0; i<s1.length();i++) {		
				if(s1.charAt(i) != s2.charAt(i)) {		// Checking every character of both are equal
					return false;
				}
			}
			return true;				// else true
		}
				
	}
}
