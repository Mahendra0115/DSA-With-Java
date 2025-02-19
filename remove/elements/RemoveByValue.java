package dsa.array.remove.elements;

public class RemoveByValue {
	public static void main(String args[]) {

		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = new int[arr1.length - 1];
		int element = 3;

		int i = 0;
		while (i < arr2.length) {
			if (i < element) {
				arr2[i] = arr1[i];
			} else if (i == element) {
				arr2[i - 1] = arr1[i];
			} else if (i < arr2.length + 1) {
				arr2[i] = arr1[i + 1];
			}
			i++;
		}

		System.out.println(java.util.Arrays.toString(arr1));
		System.out.println(java.util.Arrays.toString(arr2));

	}
}