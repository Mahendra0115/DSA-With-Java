package dsa.array.add.elements;
/* 
import java.util.Arrays;

public class AddBeforeElement {
    public static void main(String args []){
        int arr [] = {4 , 3, 7, 9, 6};
        int newElement = 8;
        int beforeElement = 9;
     
        int index = -1;
        for(int i =0; i<arr.length; i++){
            if(arr[i] == beforeElement){
                  index = i;
                  break;
            }
            
        }

     if(index == -1){
         System.out.println("Index Not Found :");
         return;
     }

    int [] newArray = new int[arr.length+1];
     for(int i =0; i<index; i++){
          newArray[i] = arr[i];
     }
     newArray[index] = newElement;
     for(int i= index; i<arr.length; i++){
        newArray[i+1] = arr[i];
      System.out.println("Add Before Element "+Arrays.toString(newArray));

    }
}
}

*/

// Using Input  
import java.util.Arrays;
import java.util.Scanner;

public class AddBeforeElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size Of Array:");
		int size = sc.nextInt();

		System.out.print("Enter the Array Element ");
		int arr[] = new int[size];

		// Taking elements for array
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter the NewElement ");
		int newElement = sc.nextInt();

		System.out.print("Enter the BeforeElement ");
		int beforeElement = sc.nextInt();

		int index = -1;

		// chacking givin beforeElement is present or not
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == beforeElement) {
				index = i;
				break;
			}
		}

		// if beforeElement is not present than print
		if (index == -1) {
			System.out.print("Element Not Fund ");
			return;
		}

		// copy elements beforeElement
		int[] newArray = new int[arr.length + 1];
		for (int i = 0; i < index; i++) {
			newArray[i] = arr[i];
		}

		// Ading newElement here
		newArray[index] = newElement;

		// copy remaining Element after add newEement
		for (int i = index; i < arr.length; i++) {
			newArray[i + 1] = arr[i];
		}

		// print new Array
		System.out.print("Add Before Element " + Arrays.toString(newArray));
	}
}
