package dsa.array.find.elements;

public class FindByValue {
	public static void main(String args[]) {
		int arr[] = { 1, 5, 3, 4, 7, 6 };
		int valueToFind = 4;
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == valueToFind) {
				System.out.println("value:  " + valueToFind + "  index:  " + i);
				found = true;
				break;
			}

		}
		if (!found) {
			System.out.println("Value no Find");
		}
	}
}
