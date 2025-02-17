package dsa.array.add.elements;

import java.util.Arrays;

public class AddElementAtLast {
	public static void main(String args[]) {
		int arr[] = { 4, 5, 6, 2, 9 };
		int newElement = 10;
		int newArray[] = new int[arr.length + 1];

		for (int i = 0; i < arr.length; i++) {
			newArray[i] = arr[i];
		}
		newArray[arr.length] = newElement;

		System.out.println("Add Element At Last" + Arrays.toString(newArray));
	}
}
