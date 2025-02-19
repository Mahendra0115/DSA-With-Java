package dsa.array.find.elements;

public class FindLastElemenet {
	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 5, 8 };
		if (0 < arr.length) {
			System.out.println("Last Element is :" + arr[arr.length - 1]);
		} else {
			System.out.println("Empty Array");
		}
	}
}