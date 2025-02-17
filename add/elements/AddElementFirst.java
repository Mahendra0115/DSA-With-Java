package dsa.array.add.elements;

// [ AddElement At Fist Index ]

//import java.util.Arrays; 

//public class AddElement {
//	public static void main(String args[]) {
//		int arr[] = { 2, 5, 6, 3, 7 }; 
//		int newElement = 1; 
//
//		int[] newArr = new int[arr.length + 1]; 
//		newArr[0] = newElement;
//
//		for (int i = 0; i < arr.length; i++) {
//			newArr[i + 1] = arr[i]; 
//		}
//
//		System.out.println("Updated array: " + Arrays.toString(newArr));
//	}
//}

// [ AddElement At Fist Index Using Taking Input ]

//import java.util.Scanner;

// public class AddElement{
//	public static void main(String args[]) {
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.print("Enter Size of Array: ");
//		int size = scanner.nextInt(); 
//
//      System.out.println("Enter Elements of Array: ");
//		int arr[] = new int[size]; 
//
//		System.out.println("Enter " + size + " elements:");
//		for (int i = 0; i < size; i++) {
//			arr[i] = scanner.nextInt(); 
//		}
//
//		System.out.print("Enter the New Element: ");
//		int newElement = scanner.nextInt(); 
//
//		int[] newArr = new int[arr.length + 1]; 
//		newArr[0] = newElement; 
//
//		for (int i = 0; i < arr.length; i++) {
//			newArr[i + 1] = arr[i]; 
//		}
//
//		System.out.println("Element added: " + Arrays.toString(newArr));
//	}
//}

import java.util.Arrays;
public class AddElementFirst{
    public static void main(String args[]){
        
        int arr[] ={3 , 2 , 5 ,6};
       
        int newElement = 4;

        int[] newArray = new int[arr.length+1];


        newArray[0] = newElement;
   for(int i =0; i<arr.length; i++){
        newArray[i+1] = arr[i];
   }

   newArray[arr.length] = newElement;
   System.out.println("Add Array"+Arrays.toString(newArray));
    }
}