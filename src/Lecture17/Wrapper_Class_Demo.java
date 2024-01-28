package Lecture17;

public class Wrapper_Class_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		Integer a1 = 90;
		System.out.println(a);
		System.out.println(a1);
		
		a1 = 0;  			// Auto-boxing(Keeping primitive into non primitive)
		
		int b = 10;
		Integer b1 = 11;
		b = b1;				// On-Boxing(Keeping Non-primitive into Primitive)
		
		Integer c1 = 18;
		Integer c2 = 18;
		Integer c3 = 183;
		Integer c4 = 183;
		
		System.out.println(c1==c2);		// True (Because int range(-128to 127) checking with cache memory
		System.out.println(c3==c4);		// False due to exceeding range  not checking with cache memory in heap
	}

}
