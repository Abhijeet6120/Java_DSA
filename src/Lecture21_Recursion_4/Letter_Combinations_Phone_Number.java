package Lecture21_Recursion_4;

public class Letter_Combinations_Phone_Number {
	
	static String[] Map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "23";
		Print(ques,"");

	}
	
	public static void Print(String ques, String ans) {
		// Base case
		if(ques.length() == 0) {
			System.out.println(ans+" ");
			return;
		}
		
		char ch = ques.charAt(0);
		String press = Map[ch-'0'];		// '2'-'0' = 48-48=0 using ASCII value to convert in integer
		
		for(int i=0; i<press.length(); i++) {
			Print(ques.substring(1), ans + press.charAt(i));
		}
	}

}
