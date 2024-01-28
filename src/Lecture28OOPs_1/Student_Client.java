package Lecture28OOPs_1;

public class Student_Client {

	public static void main(String[] args) {
		// Accessing Student class properties(Member data and Function) by creating object
		/*
		Student s = new Student();		// Creating new object 's' of Student class
		System.out.println(s.name);		// Not provided value and will give blank
		System.out.println(s.age);		
		s.name = "Monu bhaiya";			// Updating name 
		s.age = 90;						//updating age
		System.out.println(s.name);
		System.out.println(s.age);		// Provided value and will give value 
		
		Student s1 = new Student();		// Creating new object 's1' of Student class
		s1.name = "Monu bhaiya";			
		s1.age = 25;					// Updating age of Monu bhaiya 
		System.out.println(s1.name);		// Not provided value and will give blank
		System.out.println(s1.age);
		
		s.introduce_Yourself();			// calling 
		s1.introduce_Yourself();
		*/
		
		Student s2 = new Student();		// Creating new object 's2' of Student class
		Student s3 = new Student();		
		s2.name = "kunal";				// name of S2 object
		s2.age = 28;					// Age of S2
		s3.name = "Hardik";				// for S3 name
		s3.age = 26;					// For S3 Age
		
		System.out.println(s2.name + " " + s2.age);
		System.out.println(s3.name + " " + s3.age);
		System.out.println(".....................");		
//		Test1(s2, s3);
//		Test2(s2, s3);
		
		int my_age = 20;
		String my_name = "C";
		Test3(s2, s3.age, s3.name, my_age, my_name);
		System.out.println(s2.name + " " + s2.age);
		System.out.println(s3.name + " " + s3.age);
	}
	
	// Test1 function
	public static void Test1(Student s2, Student s3) {
		Student t = s2;
		s2 = s3;
		s3 = t;
	}
		
	// Test2 function
	public static void Test2(Student s2, Student s3) {

		s2 = new Student();				// Creating new object(s2) and current value is '0' value
		int tempa = s2.age;
		s2.age = s3.age;
		s3.age = tempa;

		s3 = new Student();				// Creating new object(s3) and current value is 'null' value
		String tempn = s2.name;
		s2.name = s3.name;
		s3.name = tempn;
	}
	
	// Test3 function
	public static void Test3(Student s, int age, String name, int myAge, String myName) {
		s.age = 0;
		s.name = "_";
		age = 0;
		name = "_";
		myAge = 0;
		myName = "_";
	}
	
	
}
