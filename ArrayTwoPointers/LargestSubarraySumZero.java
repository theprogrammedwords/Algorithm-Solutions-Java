/*Problem Description
You are given an array arr of size N consisting of integer values.
You need to print the largest subarray which has its integer sum equal to zero i.e., with index i and j (i<=j), arr[i] + arr[i+1] + .. + arr[j] = 0 . If there is more than one subarray with the largest length then print the sub-array among it with the least starting index.
If there is no such sub-array print -1.

Input format
First line contains an integer N.
Next line consists of N integers, the values of the array.

Output format
Print the elements of the sub-array with spaces which have the largest length and sum of elements equal to zero.

Sample Input 1
6
2 3 1 -4 0 6

Sample Output 1
3 1 -4 0

Explanation
The largest subarray with sum zero is (3, 1, -4, 0)

Constraints
1 <= N <= 10^5
-10^4 <= arr[i] <= 10^4
*/

import java.util.*;

class LargestSubarraySumZero {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        ArrayList<Integer> res = largestSubarraySumZero(n, arr);

        for (int j : res)
            System.out.print(j + " ");

    }

    static ArrayList<Integer> largestSubarraySumZero(int n, int arr[]) {


        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        ArrayList<Integer> al = new ArrayList<Integer>();


        if(arr.length == 1 ) al.add(-1);

        int len = 0;
        int sum= 0;
        int start=1, end=-1;

        hmap.put(0, -1);

        for(int i=0; i< arr.length; i++){
            sum += arr[i];

            if(hmap.containsKey(sum)){
                int l = hmap.get(sum) + 1;
                if(i-l > end-start){
                    end = i;
                    start= l;
                }
            }else{
                hmap.put(sum,i);
            }
        }

        if(start == -1) return al;
        
        for(int i =start; i<= end; i++){
            al.add(arr[i]);
        }

        if(al.size() ==0){
            al.add(-1);
        }
    return al;    
    }
}
