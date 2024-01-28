package Lecture29OOPs_2;

public class Person {

	private String name ="kirti";			// 'Private' Access modifier accessible only within class
	private int age = 89;					// Used to hide the data 
	
		// Constructor : Having same name as class name
		// Only used to initialize variable
		
		/* 1. Non-Parameterized constructor
		  public Person() { 			// constructor 
		  this.name = "Abhijeet"; 
		  this.age = 24; 
		  }
		 */
	
	// 2. Parameterized constructor
		public Person(String name, int age) { 			// constructor 
		  this.name = name; 
		  this.age = age; 
		}
	
	// 3. Default Constructor
//		public Person() {
//			// Write your code here
//		}
		
	// Non static function is called by creating object of class
		public void fun() {
			String name = "Prachi";
			int adhaar_Number = 610235543;
			System.out.println(this.name+" "+this.age+" "+adhaar_Number);
		}

// **************ENCAPSULATION***************
// Private var ko value ko update karne k liye ue karte hai setter method ka
		// Setter method
		public void setName(String name) {
			this.name = name;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		
		// Getter Method
		public String getName() {			//used to get name
			return this.name;
		}
		public int getAge() {
			return this.age;
		}

		
		
		

}
