/*Problem Description
You are given a list of integers nums. Return the minimum positive value we can append to the beginning of nums such that the prefix sum array of the resulting list contains numbers that are all greater than or equal to 0.

Input format
First line will contain a single integer N, size of the array.
Second line will contain N space separated integers representing the array.

Output format
Print the answer in a single line

Constraints
1<=N<=100000
-1000000<=nums[i]<=1000000

Sample Input 1
5
-4 2 -3 2 6

Sample Output 1
5

Explanation 1
If 5 appended to the beginning of the array.The prefix sum array would be [5, 1, 3, 0, 2, 8]
*/

import java.util.*;

class MinimumPrefix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        long res = minimumPrefix(n, arr);

        System.out.println(res);

    }

    static long minimumPrefix(int n, int arr[]) {

    long minValue = 0L;
    long sum = 0L;
     
    for(int num : arr)
    {    
        sum += (long) num;         
        minValue = (long) Math.min(minValue, sum);
    }
     
        return Math.abs(minValue);
    }
}
    
