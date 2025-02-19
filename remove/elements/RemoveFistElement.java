package dsa.array.remove.elements;

public class RemoveFistElement {
	public static void main(String args[]) {
		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = new int[arr1.length - 1];
		int i = 0;
		while (i < arr2.length) {
			arr2[i] = arr1[i + 1];
			i++;
		}
		System.out.println(java.util.Arrays.toString(arr1));
		System.out.println(java.util.Arrays.toString(arr2));

	}
}
