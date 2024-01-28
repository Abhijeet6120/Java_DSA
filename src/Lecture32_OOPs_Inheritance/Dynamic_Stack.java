package Lecture32_OOPs_Inheritance;

import Lecture29OOPs_2.Stack; //importing package to access class of that package

public class Dynamic_Stack  extends Stack{

		@Override
		public void push(int item) throws Exception {
			
			if(this.isfull()) {
				int[] ar = new int[2*arr.length];
				for(int i=0; i<ar.length; i++) {
					ar[i] = arr[i];
				}
				arr = ar;
			}
			super.push(item);		// Super keyword used to access only Parent class
		}
		
		public static void main(String[] args) throws Exception {
			
			Dynamic_Stack ds = new Dynamic_Stack();
			ds.push(10);
			ds.push(20);
			
			ds.push(30);
			ds.push(40);
			
			ds.push(50);
			ds.push(60);
			
			ds.Display();
		}
}
