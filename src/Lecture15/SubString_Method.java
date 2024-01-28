package Lecture15;

public class SubString_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Abhijeet";
		System.out.println(s.substring(2,7));
		System.out.println(s.substring(0,0));  // will not give ist index because loop will not run then will be blank
		System.out.println(s.substring(2)); 		// Will take default as till last index 
	}

}
