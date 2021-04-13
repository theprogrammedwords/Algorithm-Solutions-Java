/*You are given a string, you have to rearrange the characters of the string using a given permutation.

The permutation is in the form of an integer array with size same as that of string, in which each integer specifies the new position of the character currently present at that particular place.

For eg. consider the string "abcd" and permutation [2,4,3,1], then the new string will be "dacb".
*/

import java.util.*;

class StringPermutation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();
        int permutation[] = new int[n];

        for (int i = 0; i < n; i++)
            permutation[i] = sc.nextInt();

        String result = stringPermutation(n, str, permutation);

        System.out.println(result);

    }

    static String stringPermutation(int n, String str, int[] permutation) {
        char[] ch = str.toCharArray();
        char[] res = new char[permutation.length];

        for(int i=0; i< permutation.length; i++){
            res[permutation[i]-1] = ch[i];
        }

        String result = "";
        for(int k=0; k <res.length; k++){
            result =  result+ "" + res[k];
        }
        return result;
    }
}
