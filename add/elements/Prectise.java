package dsa.array.add.elements;

import java.util.Arrays;

public class Prectise {
	public static void main(String args[]) {
		int arr1[] = { 2, 3, 5, 4, 7, 9 };
		int arr2[] = new int[arr1.length - 1];

//		int i = 0;
//		while (i < arr2.length) {
//			arr2[i] = arr1[i + 1];
//			i++;
//		}

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[i + 1];
		}

		System.out.println("Original Array:" + Arrays.toString(arr1));
		System.out.println("Removed Element Array" + Arrays.toString(arr2));

//		int newArray[] = new int[arr.length + 1];
//
//		int index = -1;
//
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == beforeElement) {
//				index = i;
//			}
//		}
//
//		if (index == -1) {
//			System.out.println("Element Not Found :");
//			return;
//		}
//
//		for (int i = 0; i <= index; i++) {
//			newArray[i] = arr[i];
//		}
//
//		newArray[index] = newElement;
//
//		for (int i = index; i < arr.length; i++) {
//			newArray[i + 1] = arr[i];
//		}

//		     atIndex

//		int newArray[] = new int[arr.length + 1];
//
//		for (int i = 0; i < index; i++) {
//			newArray[i] = arr[i];
//		}
//		newArray[index] = newElement;
//
//		for (int i = index; i < arr.length; i++) {
//			newArray[i + 1] = arr[i];
//		}
//		

//		for(int i =0; i<arr.length; i++) {
//			 if(arr[i] == -1) {
//				 index = i;
//				 break;
//			 }
//		}
//		
//		if(index == -1) {
//			System.out.println("Element Not Found :");
//			return;
//		}
//		
//		for(int i =0; i<arr.length; i++) {
//			
//		}

//		System.out.println("Updated Array: " + Arrays.toString(newArray));
	}
}
