package Array;

import java.util.Arrays;

class RemoveDuplicat {
   
    public static void main(String[] args) {

//            ********  RemoveDuplicat With Using Extra Space    ***********



         int arr[] = {1,2,3,3,4,4,5,5,6,7};
         int temp [] = new int[arr.length];
          int j=0;
          for(int i=0; i < arr.length-1; i++){
              if(arr[i] != arr[i+1]){
            temp[j] = arr[i];
                 j++;
          }
        }
          temp[j] = arr[arr.length-1];
           System.out.print(Arrays.toString(temp));
    
      


//           ********         RemoveDuplicat Without Using Extra Space  ************

//        int arr[] = {1,2,3,3,4,4,5,5,6,7};
//         int j=0;
//         for(int i=0; i<arr.length-1; i++){
           
//             if(arr[i] != arr[i+1]){
//               arr[j] = arr[i];
//                j++;
//             }
           
//         }
//          arr[j] = arr[arr.length-1];
// // Print only the unique portion of the array
//           for(int i=0; i < j; i++){
//              System.out.print(arr[i]+ " ");
//           }
      
//     }


//    int arr[] = {1,2,3,1,4};
//    int j = 0;
//     int arr2[] = new int[arr.length];
//     for(int i = 0 ; i<arr.length-1; i++){
//         if(arr[i] != arr[i+1]){
//            arr2[j] =arr[i];
//            j++;
//         }
//     }
//     arr2[j] = arr[arr.length-1];
//     System.out.println(Arrays.toString(arr2));


    
    }
}