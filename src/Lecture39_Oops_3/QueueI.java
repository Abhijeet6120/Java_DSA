package Lecture39_Oops_3;

public interface QueueI {			// Interface
	
	public void Enqueue(int item);		// These 3 methods are given by manager that we cant change
	
	
	public int Dequeue();
	
	public int getFront();
	
	public static final int x = 90;	
	// final means cant change  
	
	// java 8.0 onwards  says can make static/ default
	
	static void fun() {		// Can't create object of interface so using static
		
	}
	default void f1() {
		
	}
	
	// java 9.0 says can make private
	
	private int f2() {
		return 0;
	}
	
	// We can create object using anonymous way of interface
/*	mostly dont use this feature
 
	public static void main(String[] args) {
		QueueI obj = new QueueI(){

			@Override
			public void Enqueue(int item) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public int Dequeue() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int getFront() {
				// TODO Auto-generated method stub
				return 0;
			}
			
		}
	};
	*/

}
