package Lecture41_Heap_PriorityQueue;

public class Heap_Client {

	public static void main(String[] args) {
		
		Heap hp = new Heap();
		hp.add(5);
		hp.add(7);
		hp.add(10);
		hp.add(2);
		hp.add(4);
		hp.add(6);
		hp.add(1);
		hp.add(8);
		hp.add(-2);
		System.out.println(hp.get());
		hp.Display();
//		System.out.println(hp.remove());
//		hp.Display();
//		System.out.println(hp.remove());
//		hp.Display();


	}

}
