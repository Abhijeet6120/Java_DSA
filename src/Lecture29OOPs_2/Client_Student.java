package Lecture29OOPs_2;

public class Client_Student {

		// 1st Method to handle exception
	// throw Exception code ko Terminate kar deta hai
	/* public static void main(String[] args) throws Exception {	// will handle exception main method
		// Jo Exception method ko call karta hai vahi handle karta hai. 
		
		Students s = new Students("Priya",23);
		s.setName("Rocky");
		s.setAge(-25);
		System.out.println(s.getName() + " "+ s.getAge());		// calling getter and setter method

	}
	*/
	
	// Try Catch code ko Terminate nhi karta hai
	// 2nd Method to handle(Jab hum Try catch use karte hai to Throw Exception likhne ki need nhi hoti jha pr call karte hai
	public static void main(String[] args){	// will handle exception main method
		// Jo Exception method ko call karta hai vahi handle karta hai. 
		
		Students s = new Students("Priya",23);
		s.setName("Rocky");
		s.setAge(-25);
		System.out.println(s.getName() + " "+ s.getAge());		// calling getter and setter method

	}


}
