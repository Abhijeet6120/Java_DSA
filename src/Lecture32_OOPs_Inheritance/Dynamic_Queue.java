package Lecture32_OOPs_Inheritance;

import Lecture30_Queue.Queue;

public class Dynamic_Queue extends Queue{
	
	// Dynamic queue 
	public void Enqueue(int item) throws Exception{
		if(isFull()) {
			int[] ar = new int[2*arr.length];
			for(int i=0; i<arr.length; i++) {
				int idx = (front + i) % arr.length;
				ar[i] = arr[idx];
			}
			arr = ar;
			front = 0;
		}
		super.Enqueue(item);
	}
	

	public static void main(String[] args) {
		// Dynamic queue 
//		Dynamic_Queue 

	}

}
