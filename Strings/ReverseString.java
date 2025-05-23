 package Array;

class ReverseString {

    public static void main(String[] args) {
        String str = "mahendra";

//             ****       Norman String Rverse

        // String rev = "";
        // for(int i=str.length()-1; i>=0; i--){
        //     rev = rev+ str.charAt(i);
        // }
        // System.out.println(rev);


        char [] arr= {'m','a','h','i','@','1','2','3'};

        int length=0;
        for(char c:arr){
            length++;
        }
        System.out.println(length);

        for(int i= arr.length-1; i>=0; i--){
              System.out.print(arr[i]);
        }








    }

}


