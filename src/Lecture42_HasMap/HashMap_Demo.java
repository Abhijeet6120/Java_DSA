package Lecture42_HasMap;
import java.util.*;

public class HashMap_Demo {

	public static void main(String[] args) {
		// Having Key: Value Pair
		//Map<String, Integer> map = new HashMap<>();
		HashMap<String, Integer> map = new HashMap<>();
		
		// Add
		map.put("Raju", 98);
		map.put("Ankush", 77);
		map.put("Ankit", 67);
		map.put("kaju", 69);
		map.put("Shivam", 57);
		map.put("Pooja", 78);
		map.put(null, 49);				// Only single null allows as key 
		map.put("Ankita", 49);
		
		System.out.println(map);
	/*	
		// get Operations
		System.out.println(map.get("shiv"));		// These keys are also Case Sensitive
		System.out.println(map.get("kaju"));
		
		// containsKey
		
		System.out.println(map.containsKey("Ankush"));		
		System.out.println(map.containsKey("Pooja"));
		
		// Remove
		
		System.out.println(map.remove("Anish"));		
		System.out.println(map.remove("Anksuh"));
		System.out.println(map);
		
		// Size
		
		System.out.println(map.size());
		*/
/* 
 * ***************Tree Map*********************
 */
		TreeMap<String, Integer> map1 = new TreeMap<>();
		
		// Add
		map1.put("Raju", 98);
		map1.put("Ankush", 77);
		map1.put("Ankit", 67);
		map1.put("kaju", 69);
		map1.put("Shivam", 57);
		map1.put("Pooja", 78);
//		map1.put(null, 49);				// Only single null allows as key 
		map1.put("Ankita", 49);
		
		System.out.println(map1);			// Tree Map Sort the key wise 

	
	/* 
	 * ***************Linked HashMap*********************
	 */
			LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
			
			// Add
			map2.put("Raju", 98);
			map2.put("Ankush", 77);
			map2.put("Ankit", 67);
			map2.put("kaju", 69);
			map2.put("Shivam", 57);
			map2.put("Pooja", 78);
//			map2.put(null, 49);				// Only single null allows as key 
			map2.put("Ankita", 49);
			
			System.out.println(map2);			// Tree Map Sort the key wise 
			
			
			// Print key and value
//			Set<String> s = map.keySet();
//			System.out.println(s);
//			for(String key: s) {
//				System.out.println(key+" "+ map.get(key));
//				
//			}
			
			for(String key: map2.keySet()) {
				System.out.println(key+" "+ map2 .get(key));
			}
			System.out.println();
			
		}
}
