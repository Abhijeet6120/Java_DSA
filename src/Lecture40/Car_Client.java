package Lecture40;

import java.util.*;

public class Car_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car[] arr = new Car[5]; // 5 size to keep cars in array

		arr[0] = new Car(200, 10, "White");
		arr[1] = new Car(2000, 20, "Black");
		arr[2] = new Car(343, 3, "Yellow");
		arr[3] = new Car(34, 89, "Grey");
		arr[4] = new Car(8907, 6, "Red");
//		Sort(arr);
		// second method to sort on tha basis of any method

		Arrays.sort(arr, new Comparator<Car>() { // Anonymous method

			@Override
			public int compare(Car o1, Car o2) {
				
//				return  o1.Price - o2.Price;
//				return o1.speed - o2.speed;
				return o1.color.compareTo(o2.color);
				
			}
		});
		
		Display(arr);

	}

	// To dis[lay all the cars
	public static <T> void Display(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}

	// Sorting
//		public static <T extends Comparable<T>>void Sort(T[] arr) {		//  Setting bound of comparable 
//			
//			for(int turn = 1;turn<arr.length;turn++) {
//				for(int i=0;i<arr.length-turn ;i++) {
//			
//					if(arr[i].compareTo(arr[i+1]) > 0) {		// We can't use < and > to compare address
//						T temp = arr[i];
//						arr[i] = arr[i+1];
//						arr[i+1] = temp;
//					}
//				}
//			}
//		}

}