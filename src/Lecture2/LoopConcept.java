package Lecture2;

public class LoopConcept {

	public static void main(String[] args) {
		// While loop concept
		/*int i = 0;
		while(i<=5) {
			System.out.println("Hxsello");
			i++;
		}
		
		int x = 7;
		System.out.println(x++); // post increment first print then increment
		System.out.println(x);
		
		int  p = 7;*/
		// \sum of \n natural number
		int N= 10;
		int sum = 0;
		int i = 0;
		while(i<=N){
			sum = sum +i;
			i++;
		}
		System.out.println(sum);
	}

}
