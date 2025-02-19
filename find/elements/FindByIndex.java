package dsa.array.find.elements;

public class FindByIndex {
	public static void main(String args[]) {
		int arr[] = { 4, 2, 3, 6 };
		int index = 3;
		if (index >= 0 && index < arr.length) {
			System.out.println("Find Element By Index :" + arr[index]);
		} else {
			System.out.println("Error ");

		}
	}
}
