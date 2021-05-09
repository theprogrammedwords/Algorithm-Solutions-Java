/*Problem Description (Quadratic TC Solution)
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

class MaxSumTriplet {
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

        long triplet = 0L;

        for(int j=1; j<n-1;j++){
        long maxleft =0L;
        long maxright =0L;
            for(int i =0; i<j; i++){

                if(arr[i] < arr[j] && arr[i] > maxleft && i < j){
                    maxleft= arr[i];
                }
            
            }

            for(int k=j+1; k<n; k++){

                if(arr[k]>arr[j] && arr[k] > maxright && k > j){                
                    maxright= arr[k];
                }
            
            }
                //System.out.println(" MAXLEFT "+ maxleft + " J " +arr[j] +" MAXRIGHT "+ maxright);
            if(arr[j] + maxleft + maxright > triplet){
                if(maxleft < arr[j] && maxright > arr[j] && maxright !=0 && maxleft != 0)
                triplet  = arr[j] + maxleft + maxright;
            } 
        }

        
        if(triplet > 0) return triplet;
        

    return 0L;
    }
}
