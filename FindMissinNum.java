package Array;

import java.util.Arrays;

public class FindMissinNum {

    public static void main(String[] args) {
        // int n = 6;
        // int arr[] = {1,2,4,5,6};
        // int totalsum = n*(n+1)/2;
        // int actuleSum = 0;
         
        // for(int num : arr){
        //    actuleSum += num;
        // }

        // int missing = totalsum-actuleSum;
        // System.out.println("missing num :" +missing);


        int arr[] = {1,2,1,3,1,4,1,5};
       
        int j =0;
        int arr2[] = new int[arr.length];
        for( int i =0; i< arr.length-1; i++){
            
           if(arr[i] != arr[i+1]){
               arr2[j] = arr[i];
               j++;
           }
        }
        arr[j] = arr[arr.length-1];
        System.out.println(Arrays.toString(arr2));

    }
}