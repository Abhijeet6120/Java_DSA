package Lecture17;
import java.util.*;
public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();		// Syntax of ArrayList
		System.out.println(list);
		
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		list.add(0,89);
		System.out.println(list);// Shift 1st index to next index
		list.add(2,89);
		System.out.println(list);// Shift 1st index to next index l
		// Remove 
		
		System.out.println(list.remove(1));
		System.out.println(list);
		System.out.println("Adding 201,-30");
		list.add(201);
		list.add(-30);
		System.out.println(list);
		
		// Update
		System.out.println("updating 2nd index with -97");
		list.set(2,-97);
		System.out.println(list);
		
		// Sorting in array list
		Collections.sort(list);	
		System.out.println(list);			// Sorted list print
		
		// Display
		
		System.out.println("Display sorted list");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) +" ");
		}
		
		// For each loop
		for(int i : list) {
			System.out.print(i +" ");
		}
		System.out.println();
		
	}

}
