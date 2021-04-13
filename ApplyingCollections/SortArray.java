//Given an array of n strings. Sort the array in lexicographical order.

import java.util.*;

class SortArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.next();

        String sortedArr[] = sortArray(n, arr);

        for (String word : sortedArr)
            System.out.print(word + " ");
    }

    static String[] sortArray(int n, String[] arr) {
            for(int i = 0; i< n; i++){
                for(int j = i+1; j<n ; j++){
                    if(arr[i].compareToIgnoreCase(arr[j]) > 0){
                        String temp = arr[i]; 
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            
            }

        return arr;
    }
}
