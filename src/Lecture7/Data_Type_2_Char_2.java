package Lecture7;

public class Data_Type_2_Char_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = 'a';
		System.out.println((int)(ch)); // Type casting 
		int i = 1;
		i++; // i = (int)(i+1); This is working inside type casting by system
		i += 1; // i = (int)(i+1); System doing internal type casting
		ch++; // ch = (char)(ch+1);
		ch = (char)(ch+1);
		ch+=1;
		System.out.println(ch); // 98
		
	}

}
