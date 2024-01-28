package Lecture29OOPs_2;

public class Students {
	
	private String name ="kirti";	//'Private' Access modifier accessible only within class
	private int age = 89;
	
	public Students(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
// **************Encapsulation**********************
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	// Getter method 
	public int getAge() {
		return this.age;
	}
	
/* **=>First method to handle exception using throw keyword**
		public void setAge(int age) throws Exception{		// throws: Might be throw exceptions if below cond is true
			if(age < 0) {
				throw new Exception("Pagal hai Age -ve nhi hota");	// throwing error if age lt 0
			}
			this.age = age;
		}
	*/
	
//  **=>2nd Method of Exception(Try catch method)**

	public void setAge(int age) {		// throws: Might be throw exceptions if below cond is true
		
		try {		// danger code will be here
			if(age < 0) {
				throw new Exception("Pagal hai Age -ve nhi hota");	// throwing error if age lt 0
			}
		} 
		catch (Exception e) {			// Handling will be here in catch
			System.out.println(e);
//			e.printStackTrace();		// this will show in which line exception is showing
		}	
		finally {		// Always write this finally in try catch(Agar koi nhi chalega to v ye chalega)
//			System.out.println("Hey Baby, This is Abhijeet!");
			System.out.println(this.getName());
			
		}
		
		this.age = age;
	}
}
