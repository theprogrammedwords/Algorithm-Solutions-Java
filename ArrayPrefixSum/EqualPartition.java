/*
Problem Description
Partition of the array is defined as such that it divides the array into two equal parts. Find the element that after partition sum of left side elements will be equal to sum of right side elements.

If there is no such element return -1 otherwise return the index of the required element

Input format
First line will contain a single integer N.

Second line will contain n space separated integer representing array elements.

Output format
Output the answer in a single line

Constraints
2 <= N <= 1000000

1 <= Arr[i] <= 1000000000

Sample Input 1
4

1 4 2 5

Sample Output 1
2

Explanation 1
Since 1 + 4 = 5 where 2 is such element.
*/
import java.util.*;

class EqualPartition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long arr[] = new long[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextLong();

        int res = equalPartition(n, arr);

        System.out.println(res);
    }

        static int equalPartition(int n, long arr[]) {

        if (n ==1) return -1;

        long sum=0;
        long lsum=0;
        long rsum=0;

        for(int i=0; i< n; i++) {
            sum += arr[i];
        }

        rsum = sum;
        for(int i=0; i< n; i++) {
            rsum = rsum - arr[i];

            if (rsum == lsum) return i;
            else lsum += arr[i];
        }
        return -1;

    }
}
