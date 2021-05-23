/*
Problem Description
Find the maximum sum using any k elements from the given array.

Input format
First line will contain two space separated integers N size of the array Q number of queries
Second line will contain N space separated integers representing array A.
Following Q lines will contain single integer K for each query..

Output format
Print the maximum sum obtained for each query in single line

Sample Input 1
4 2
4 2 4 1
2
3

Sample Output 1
8
10

Explanation 1
For first query 4 + 4 = 8

Similarly for second query top 3 elements will be 4,4 and 2 which sums to 10

Constraints
1<=N<=100000
1<=Q<=N

1<=A[i]<=1000000000 for each i.
*/
import java.util.*;

class MaximumKSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int queries[] = new int[q];

        for (int i = 0; i < q; i++) {
            queries[i] = sc.nextInt();

        }

        ArrayList<Long> res = maximumKSum(n, q, arr, queries);

        for (long j : res) {
            System.out.println(j);
        }

    }

    static ArrayList<Long> maximumKSum(int n, int q, int arr[], int queries[]) {
        ArrayList<Long> result = new ArrayList<Long>();
        long[] longArray = Arrays.stream(arr).mapToLong(i -> i).toArray();
        Arrays.sort(longArray);


        for(int i=longArray.length-2; i>=0 ; i--){
            longArray[i] = longArray[i]+longArray[i+1];
        }

        for(int i=0; i< q; i++){
            result.add( (long)longArray[n-queries[i]]);
        }

        return result;
    }
}
