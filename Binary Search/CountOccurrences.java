/*

Problem Description
Given a sorted integer array of length n with possible duplicate elements. Find the number of occurrences of an integer k using binary search.

Input format
There are 2 lines of input.

First line contains 2 space separated integers n, k - Number of elements, the integer k.
Second line contains n space separated integers - The integer array.

Output format
Print the number of occurrences of the integer k.

Sample Input 1
5 2
-1 2 2 4 7

Sample Output 1
2

Explanation 1
The integer 2 occurs 2 times in the given array.

Constraints
1 <= n <= 10^6
-10^9 <= k <= 10^9
-10^9 <= A[i] <= 10^9
*/

import java.util.*;

class CountOccurrences {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int res = countOccurrences(n, k, a);

        System.out.println(res);
    }

    static int countOccurrences(int n, int k, int a[]) {

        if(a.length == 1 && a[0] == k) return a.length;


        int firstOccurance = checkOccurance(a, k, true);
        int lastOccurance = checkOccurance(a, k, false);


        if(firstOccurance == 0 && lastOccurance==0 ) return 0;
        else return lastOccurance-firstOccurance+1;

    }



    
    static int checkOccurance(int[] A , int x, boolean searchFirst){
        int left = 0;
        int right = A.length - 1;
        int result = 0;

        while (left <= right)
        {
        
            int mid = (left + right) / 2;
            if (x == A[mid])
            {
                result = mid;
                 if (searchFirst) {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
            else if (x < A[mid]) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
 
        return result;
    }
}
 
