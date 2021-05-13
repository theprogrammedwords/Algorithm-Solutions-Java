/*Problem Description
Given a sorted array of integers as input, find if there is a pair in the array whose values add up to a specified target. If there is no such pair print "Not Present".

Input format
First line contains an Integer N that represents the number of elements in the array.
Second line contains N space separated integers, which are members of the array.
Third line contains an integer X, which is the target value.

Output format
Print "Present" if there is such a pair present in the array otherwise print "Not Present".

Constraints
2 <= Length of array <= 100000
1 <= Range of values <= 1000000

Sample Input 1
5 --> Number of elements in array
2 4 5 8 9 --> Array elements
7 --> Target sum value

Sample Output 1
Present

Explanation 1
Since 0 and 2 are the indices where the numbers 2 and 5 which add up to 7 are seen
*/

import java.util.*;

class TwoSumInSortedArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        boolean res = twoSumInSortedArray(n, arr, k);

        String ans = (res) ? "Present" : "Not Present";

        System.out.println(ans);

    }

    static boolean twoSumInSortedArray(int n, int arr[], int k) {

        Arrays.sort(arr);

        int right= n-1;
        int left =0;
        while(left < right) {
            if(arr[left] + arr[right] > k && left < right){
                right--;
            }else if(arr[left] + arr[right] < k && left < right){
                left++;
            }
            if((arr[left] + arr[right]) == k && left < right){
            return true;
            }
        }
        return false;
    }
}
