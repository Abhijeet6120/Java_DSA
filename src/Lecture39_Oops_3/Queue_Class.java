package Lecture39_Oops_3;

public class Queue_Class implements QueueI{		// Queue class using QueueI interface

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
	
	public static void main(String[] args) {
		Queue_Class q =new  Queue_Class();
		q.Enqueue(10);
	}

}
