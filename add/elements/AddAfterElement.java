package dsa.array.add.elements;

import java.util.Arrays;

public class AddAfterElement {
	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 5, 6 };
		int newElement = 4;
		int afterElement = 3;
		int index = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == afterElement) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("Element Not Found:");
		}

		int newArray[] = new int[arr.length + 1];

		for (int i = 0; i <= index; i++) {
			newArray[i] = arr[i];
		}

		newArray[index + 1] = newElement;

		for (int i = index + 1; i < arr.length; i++) {
			newArray[i + 1] = arr[i];
		}

		System.out.println("Add After Element" + Arrays.toString(newArray));
	}
}
