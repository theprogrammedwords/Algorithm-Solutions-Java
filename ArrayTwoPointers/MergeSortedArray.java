/*Problem Description
Given two sorted integer arrays nums1 and nums2, and then return the merged sorted array..

Note:
The number of elements initialized in nums1 and nums2 are m and n respectively.

Input format
A single Integer M, that contains the number of elements in the first array.
A single Integer N, that contains the number of elements in the second array.
Next Line contains M space Integers of the array nums1.
Next Line contains N space Integers of the array nums2.

Output format
Print the array after merging.

Sample Input 1
3
3
1 2 3
2 5 6

Sample Output 1
1 2 2 3 5 6

Explanation 1
The sorted array is returned after merging.

Constraints
1 <= N,M <= 10^5
|nums1[i] | <= 10^9
|nums2[i] | <= 10^9
*/

import java.io.*;
import java.util.*;

public class MergeSortedArray {
    // Implement your solution by completing the below function
public static int [] mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
    int[] merged = new int[m+n];

    int j=0, k=0, i=0;

    while(j<m && k<n){
        if(nums1[j] < nums2[k]){
            merged[i++]=nums1[j++];

        }else{
            merged[i++]=nums2[k++];
        }
    }


    while(j < m){
        merged[i++] = nums1[j++];

    }

    while(k < n){
        merged[i++] = nums2[k++];

    }

    return merged;
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[] nums1 = new int[m];
        int[] nums2 = new int[n];

        for (int i = 0; i < m; i++)
            nums1[i] = scanner.nextInt();
        for (int i = 0; i < n; i++)
            nums2[i] = scanner.nextInt();

        scanner.close();

        int[] nums = mergeSortedArray(nums1, m, nums2, n);
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");
    }
}
