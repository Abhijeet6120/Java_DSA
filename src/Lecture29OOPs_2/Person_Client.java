package Lecture29OOPs_2;

public class Person_Client {
	
	public static void main(String[] args) {
		/*
		 1. age/name default nhi hoga to null/0 print hoga
		 2. age/name default hoga and name /age manually nhi denge to default wala print hoga
		 3. Agar manuall denge to manuall wala print hoga 
		 */
		
		// Non-Parameterized constructor
	/*	Person p = new Person();				// calling constructor, 
		p.name = "Kaju";				// updating name
		p.age = 23;						// updating age
		p.fun();
		Person p1 = new Person();
		p1.name = "Kunal";
		p1.age = 45;
		p.fun();
	*/
		// Parameterized constructor
		Person p = new Person("karan", 25);				// calling constructor, 
//		p.name = "Kaju";				// updating name
//		p.age = 23;						// updating age
		p.setName("Priya");			// updating name using set method of encapsulation
		System.out.println(p.getAge());			// Getting age of object 'p' by calling getter method
		p.fun();	
			
		Person p1 = new Person("Kumar", 26);
//		p1.name = "Kunal";
//		p1.age = 45;
		p1.fun();

	}

}
