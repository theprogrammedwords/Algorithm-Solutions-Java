/*
Problem Description
Given a sorted array, find a fixed point - that is, where A[i] = i. If one is present, return the index i. If none is present, return -1.
You may assume that there’s only one such fixed point and that there are no duplicates in the array.


NOTE: Indexing starts from 0.

Input format
There are 2 lines of input.
First line will contain the single integer representing N.
Next line will contain N space separated integers representing Array A.

Output format
Print the single integer

Sample Input 1
5
-3 -1 2 4 5

Sample Output 1
2

Explanation
A[2] = 2

Constraints
-10^6<=Ai<=10^6
0<=N<=10^5


*/

import java.util.*;

class FixedPoint {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int res = fixedPoint(n, a);

        System.out.println(res);
    }

    static int fixedPoint(int n, int a[]) {

     /* Linear approach O(n)
         for(int i=0; i< a.length; i++){
            if(i==a[i]) return i;
        
        }
     */   

     // binary search approach 


     int high =a.length;
     int low = 0;

    return binarySearch(a, low,high);
    }

    static int binarySearch(int a[], int low, int high){
    
         if(low <= high){
             int mid = low + (high-low) /2;

             if(mid == a[mid]) 
                return mid;
            
            if(a[mid] > mid)
                return binarySearch(a,low, mid-1);
            return binarySearch(a,mid+1, high);
        }
         return -1;

    }
}
