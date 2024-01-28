package Lecture39_Oops_3;

public abstract class Abstract_Demo {
	
	public abstract void payment();				// Without body
	
	public void ViewItem() {
		
	}
	public abstract int No_Item();
	
	public static void main(String[] args) {
		Abstract_Demo ab = new Abstract_Demo() {		// Anonymous way to create object of abstract class
			
			// Created object 
			@Override
			public void payment() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public int No_Item() {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
		ab.payment();								// cant call object cause dont have body
		// Abstract_Demo ab = new Abstract_Demo()

	}

}
