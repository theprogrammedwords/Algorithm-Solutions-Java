/*
Problem Description
Given an array nums, you need to find the maximum sum of triplet (nums[i] + nums[j] + nums[k]) such that 0 <= i < j < k and nums[i] < nums[j] < nums[k]. If no such triplet exists print 0.

Input format
First line contains an integer t - No of test cases.

First line of each test case contains an integer n - No of elements in the array.
Second line of each test case contains N space separated integers - The array nums.

Output format
For each test case print the answer in a new line.

Sample Input 1
3
7
3 7 4 2 5 7 5
4
5 2 4 5
3
3 2 1

Sample Output 1
16
11
0

Explanation 1
In the first case valid triplets are: [3,4,5], [3,4,7], [4,5,7], [2,5,7]. Out of these [4,5,7] have maximum sum i.e. 16.
In the third case there are no valid triplets.

Constraints
1 <= t <= 100
3 <= n <= 10^5
1 <= nums[i] <= 10^9

It is guaranteed that the sum of n over all test cases is less than 10^5.
*/
import java.util.*;

class MaxSumTripletOptimized {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            long arr[] = new long[n];

            for (int i = 0; i < n; i++)
                arr[i] = sc.nextLong();

            long result = maxSumTriplet(n, arr);

            System.out.println(result);

        }

    }

    static long maxSumTriplet(int n, long arr[]) {

        if(n==1)  return 0L;

        long[] maxSuffix = new long[n+1];
        maxSuffix[n] =0;
        
        for(int i= n-1; i>=0; --i){
            maxSuffix[i] = Math.max(arr[i], maxSuffix[i+1]);
        } 

        long ans=0L;
        TreeSet<Long> tSet = new TreeSet<Long>();
        tSet.add(Long.MIN_VALUE);

        for(int i =0; i< n-1; i++){
            if(maxSuffix[i+1] > arr[i]){
                ans = Math.max(ans, tSet.lower(arr[i]) + arr[i] + maxSuffix[i+1] );
            }
        tSet.add(arr[i]);
        }

    return ans;
    }
}
