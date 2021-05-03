/*Write a program to find the sum of a contiguous subarray within a one-dimensional array of numbers which has the largest sum.
Note: Such a contiguous subarray should have at least one number i.e. empty subarray is not allowed.

Input format
First line contains N, the number of elements in the array.
Second line contains N space separated numbers, representing the array elements.

Output format
A single integer which is the maximum possible contiguous subarray sum

Constraints
1 ≤ N ≤ 10^5
-10^9 ≤ A[i] ≤ 10^9

Sample Input 1
8
-2 -3 4 -1 -2 1 5 -3

Sample Output 1
7

Explanation 1
If we take the contiguous subarray [4 -1 -2 1 5], this subarray has a sum of 7, which is the maximum possible sum.
*/

import java.io.*;
import java.util.Scanner;
public class  ContigiousSequence {
        //To calculate max continuous subsequence
	public static  long contigiousSequence(int arr[] , int n) {
		Long maxSum =0L;
		Long maxSoFar=Long.MIN_VALUE;
		for(int i=0; i<arr.length; i++){
			maxSum += (long) arr[i];

			if(maxSum>maxSoFar){
				maxSoFar= maxSum;
			}

			if(maxSum <0){
				maxSum =0L;
			}

		}
		
		return maxSoFar;
	}
	public static void  main (String args []) {

		Scanner sc =  new  Scanner (System.in);

		int n = sc.nextInt();
		int arr [] = new int[n];
		for ( int i = 0 ; i < n; i++)
			arr[i] = sc.nextInt();

		long max = contigiousSequence(arr, n);
		System.out.println(max);

	}
}

