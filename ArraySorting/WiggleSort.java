/*
Problem Description
Given an unsorted array nums, reorder it such that nums[0] < nums[1] > nums[2] < nums[3]....

Input format
First line contains an integer N ,the number of input integers in the array.
Second line contains N space separated integers.

Output format
N space separated elements which satisfy the given condition.

Sample Input 1
6
1 5 1 1 6 4

Sample Output 1
1 4 1 5 1 6

Explanation 1
nums[0] < nums[1] > nums[2] < nums[3] > nums[4] < nums[5].

Constraints
1 <= N <= 100000
-10^9 <= A[i] <= 10^9
*/

import java.util.*;


class WiggleSort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer>nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }
        List<Integer>ans = wiggleSort(n,nums);
        for (int i = 0; i < n; i++) {
            System.out.print(ans.get(i)+" ");
        }
    }

    static List<Integer> wiggleSort(int n, List<Integer>nums){

        List<Integer> mylist = new ArrayList<Integer>();
        mylist.addAll(nums);
        int nlen = nums.size() -1;
        
        Collections.sort(mylist);
        
        for(int i=1; i< nums.size(); i+=2){
            nums.set(i,mylist.get(nlen--));
        }

        for(int i=0; i< nums.size(); i+=2){
            nums.set(i,mylist.get(nlen--));
        }

        return nums;
        
        }
}
