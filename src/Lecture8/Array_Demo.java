package Lecture8;

import java.util.*;

public class Array_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = new int[7]; // C Type declaration java suport both type this is used in C++
		int[] arr = new int[5];
		System.out.println(arr);
		// 
		arr[0] = 4;
		arr[1] = 5;
		arr[2] = 6;
		arr[3] = 7;
		arr[4] = 8;
		System.out.println(arr.length);
		
		for(int i =0;i<=arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		int[] other = arr;// Storing arr in other variable
		System.out.println(other);
	}

}
