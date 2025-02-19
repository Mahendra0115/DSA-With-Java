package dsa.array.remove.elements;

import java.util.Arrays;

public class RemoveByIndex {
	public static void main(String args[]) {
		int arr1[] = { 1, 2, 3, 4, 5, 6 };
		int arr2[] = new int[arr1.length - 1];
		int index = 3;
		int i = 0;
		while (i < arr2.length) {
			if (i < index) {
				arr2[i] = arr1[i];
			} else if (i == index) {
				arr2[i] = arr1[i + 1];
			} else if (i < arr2.length) {
				arr2[i] = arr1[i + 1];
			}
			i++;
		}
		System.out.println("Original Array is :" + Arrays.toString(arr1));
		System.out.println("Updated  Array is :" + Arrays.toString(arr2));
	}

}
