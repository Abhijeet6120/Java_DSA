package Lecture20_Recursion_3;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		printPath(n,0,"");
	}

	public static void printPath(int end, int curr, String ans) {
		// TODO Auto-generated method stub
		if(curr == end) {						// If current p[osition equal to destination position
			System.out.println(ans);
			return;
		}
		if(curr > end) {			// If current p[osition greater than destination(end N=4) position
			return;					// simply return karenge vaha se kyuki 4 sidhi se aage chala jayega
		}
//		printPath(end,curr + 1,ans+1);
//		printPath(end,curr + 2,ans+2);
//		printPath(end,curr + 3,ans+3);
		
		for(int dice=1; dice<=3; dice++) {
			printPath(end,curr + dice,ans+dice);
			
		}
	}

}
