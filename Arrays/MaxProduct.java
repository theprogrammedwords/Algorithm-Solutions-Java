/*
Problem Description
You are given an array consisting of n integers. Your task is to find the maximum product of 4 numbers in the array.

Input format
First line contains a single integer n - the number of elements in the array. Second line contains n space-separated integers - the array elements.

Output format
Print the maximum product of 4 numbers in the array.

Sample Input 1
6 
-10 3 2 0 1 7

Sample Output 1
42

Explanation
We get the maximum product when we choose the elements {3,2,1,7}.

Constraints
4 <= n <= 10^5 -10^4 <= a[i] <= 10^4
*/
import java.util.*;

class MaxProduct {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        long res = maxProduct(n, arr);

        System.out.println(res);

    }

    static long maxProduct(int n, int arr[]) {

        if(n< 4) return -1; 

        Arrays.sort(arr);

        long x = (long) arr[n-4] * arr[n-3] * arr[n-2] * arr[n-1];        
        long y = (long) arr[0] * arr[1] * arr[2] * arr[3];
        long z = (long) arr[0] * arr[1] * arr[n-1] * arr[n-2];


        return (long) Math.max(x, Math.max(y, z));
    }

}
