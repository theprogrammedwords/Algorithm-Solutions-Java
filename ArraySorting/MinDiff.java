/*Problem Description
Find the minimum difference possible between any two elements in the given array.

Input format
First line will contain a single integer n representing the size of the array.
Second line will contain n space separated integers representing the array.

Output format
Output the answer in single line.

Sample Input 1
3
1 2 4

Sample Output 1
1

Explanation 1
2 - 1 = 1 minimum difference

Constraints
2<=n<=100000
1<=A[i]<=1000000000
*/

import java.util.*;

class MinDiff {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int res = minDiff(n, a);

        System.out.println(res);

    }

    static int minDiff(int n, int a[]) {
        int mini = Integer.MAX_VALUE;
        Arrays.sort(a);

        for(int i=0; i<a.length-1; i++){
            if(mini > a[i+1]- a[i]){
                mini = a[i+1]- a[i];
            }
        }

    return mini;
    }
}
