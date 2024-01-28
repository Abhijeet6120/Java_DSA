package Lecture23_Recursion_6;
import java.util.*;

public class Two_D_List_Demo {

	public static void main(String[] args) {
		// TODO 2D list Demo
		List<List<Integer>> l2 = new ArrayList<>();			// For 2D list var l2
		List<Integer> l1 =new ArrayList<>();				// For 1D list var l1
		
		l2.add(l1);
		System.out.println(l2.get(0));	// blank list
		l2.get(0).add(6);									// adding value in 2D List m
		
		System.out.println(l2);						// [[6]] print
		System.out.println(l2.get(0));				// l2 k 1st index ki value dega
		
		l2.get(0).add(7);
		System.out.println(l2);	

	}

}
