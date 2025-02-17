package dsa.array.add.elements;

import java.util.Arrays;

/*
 public class AddElementAtIndex {
	public static void main(String args[]) {
		int arr[] = { 10, 20, 30, 50, 60 };
		int newElement = 40;
		int index = 3;
		int[] newArray = new int[arr.length + 1];

		for (int i = 0; i < index; i++) {
			newArray[i] = arr[i];
		}
		newArray[index] = newElement;

		for (int i = index; i < arr.length; i++) {
			newArray[i + 1] = arr[i];
		}

		System.out.println("Add Elements At index" + Arrays.toString(newArray));

	}
}

 */

import java.util.Scanner;

public class AddElementAtIndex {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Array: ");
		int size = sc.nextInt();
		System.out.print("Enter the Elements Of Array: ");
		int arr[] = new int[size];

		// storing element in array
		System.out.println();
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter the Index No: ");
		int index = sc.nextInt();

		System.out.print("Enter the New Element: ");
		int newElement = sc.nextInt();

		System.out.print("Original Array is :");
		System.out.println(Arrays.toString(arr));

		int[] newArray = new int[arr.length + 1];

		for (int i = 0; i < index; i++) {
			newArray[i] = arr[i];

		}

		newArray[index] = newElement;

		for (int i = index; i < arr.length; i++) {
			newArray[i + 1] = arr[i];
		}
		// System.out.println();
		System.out.println("Add New Element At Index :" + Arrays.toString(newArray));

	}
}
