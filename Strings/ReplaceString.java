
// public class SimpleReverse {
//     public static void main(String[] args) {
//         String str = "i am mahi";
//         StringBuilder lettersOnly = new StringBuilder();

//         // Step 1: collect all characters except spaces
//         for (int i = 0; i < str.length(); i++) {
//             if (str.charAt(i) != ' ') {
//                 lettersOnly.append(str.charAt(i));
//             }
//         }

//         // Step 2: reverse those characters
//         lettersOnly.reverse();

//         // Step 3: rebuild final string with spaces preserved
//         StringBuilder result = new StringBuilder();
//         int k = 0;  // index for reversed characters

//         for (int i = 0; i < str.length(); i++) {
//             if (str.charAt(i) == ' ') {
//                 result.append(' ');
//             } else {
//                 result.append(lettersOnly.charAt(k));
//                 k++;
//             }
//         }

//         // Step 4: print result
//         System.out.println(result.toString());
//     }
// }

package Strings;

public class ReplaceString {
    public static void main(String[] args) {

        String str = "I am Mahendra";
        StringBuilder latterOnly = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                latterOnly.append(str.charAt(i));
            }
        }

        latterOnly.reverse();

      
            StringBuilder result = new StringBuilder();
            int k = 0;
            for (int i = 0; i <= str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    result.append(' ');
                } else {
                    result.append(latterOnly.charAt(k));
                    k++;
                }
                System.out.println(result.toString());
            }
        

    }
}
