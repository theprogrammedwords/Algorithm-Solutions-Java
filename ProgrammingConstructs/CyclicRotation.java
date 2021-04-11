//Given an array of n integers and an integer k. Rotate the array k times in clockwise order.

import java.util.*;

class CyclicRotation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int rotatedArr[] = cyclicRotation(n, arr, k);

        for (int j : rotatedArr)
            System.out.print(j + " ");

    }

    static int[] cyclicRotation(int n, int[] arr, int k) {
        int[] cyclicresult = new int[n];
        int shift= 0;
        for(int i=0; i<arr.length; i++){
            shift = (i + k)% n;
            cyclicresult[shift] = arr[i];
        }
    return cyclicresult;
    }
}
