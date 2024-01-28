package Lecture42_HasMap;
import java.util.*;

public class HashSet_Demo {

	public static void main(String[] args) {
		// it is same as Arraylist but Set only contains unique value
//		Set<Integer> set = new HashSet<>();
		HashSet<Integer> set = new HashSet<>();
		// Add operation
		
		set.add(1);
		set.add(10);
		set.add(16);
		set.add(-1);
		set.add(6);
		set.add(11);
		set.add(2);
		set.add(30);
		set.add(7);
		
		System.out.println(set);
/*		
		// contains
		System.out.println(set.contains(4));
		System.out.println(set.contains(10));
		
		// remove
		System.out.println(set.remove(110));
		System.out.println(set.remove(11));
		System.out.println(set);
*/	
		TreeSet<Integer> set1 = new TreeSet<>();
		// Add operation
		
		set1.add(1);
		set1.add(10);
		set1.add(16);
		set1.add(-1);
		set1.add(6);
		set1.add(11);
		set1.add(2);
		set1.add(30);
		set1.add(7);
		
		System.out.println(set1);
		
		
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		// Add operation
		
		set2.add(1);
		set2.add(10);
		set2.add(16);
		set2.add(-1);
		set2.add(6);
		set2.add(11);
		set2.add(2);
		set2.add(30);
		set2.add(7);
		
		System.out.println(set2);
		
		// For each loop
		for(int value: set) {
			System.out.print(value+" ");		// No indexing direct value
		}
		System.out.println();
		
		// Print key and value
		

	}

}
