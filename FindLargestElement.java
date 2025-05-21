package Array;

public class FindLargestElement {
    public static void main(String[] args) {
         int arr[] = {1,4,2,7,3,5};
     int max = 0;
     for(int i =0; i<arr.length; i++){
        if(arr[i] > max){
            max = arr[i];
        }
     }
     System.out.println("Largest is "+max);
    }
   
}
