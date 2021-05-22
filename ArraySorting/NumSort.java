/*
Problem Description
You are given a list of integers as string. As number of digits for each integer can be upto 1000000. Sort the array elements in increasing order and return the sorted array.

Input format
First line will contain a single integer n, the size of array.
Second line will contain n space seperated integers.

Output format
Return n space seperated integers in a single line

Sample Input 1
5
3 30 1 124 54644

Sample Output 1
1 3 30 124 54644

Constraints
1<=n<=200000

1<=Number of digits in each string<=1000000

1<=Total Count of digits of all strings<=1000000

No leading zeroes string will be given
*/

import java.util.*;
import java.math.BigInteger;

class NumSort {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String arr[] = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        String sortedArray[] = numSort(n, arr);

        for (String num : sortedArray) {
            System.out.print(num + " ");
        }

    }

    static String[] numSort(int n, String[] arr) {

        Vector<BigInteger> vect = new Vector<>();

        for(int i=0; i<arr.length; i++){
            vect.add(new BigInteger(arr[i]));
        }

        Collections.sort(vect, new Comparator<BigInteger> (){
            @Override public int compare(BigInteger A, BigInteger B){

                return B.compareTo(A) > 0 ? -1 : 1;
            }
        });

        for(int i=0; i< vect.size(); i++){
            arr[i] = vect.get(i) +"";
        }

        return arr;
    }
}

