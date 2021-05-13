/*
Problem Description
Given a sorted array, remove all duplicates such that each element occurs once in the array and return the length of the modified array.
Note : The input array should be modified in-place i.e. no extra memory should be allocated to any other array and the question should be solved by using O(1) memory.

Input format
The first line consists of an integer N, which denotes the size of the input array
The second line consists of N space separated integers, which acts as our input array.

Output format
Prints the size of the modified array which consists of no duplicates.

Function Definition
Complete the function removeDuplicates in the code editor for a language of your choice.
removeDuplicates has the following parameters :
nums : An array of numbers in the sorted order
removeDuplicates returns :
int : An integer denoting the size of the modified array.

Constraints
0 <= N <= 10^6
1 <= A[i] <= 10^9

where A[i] denotes the ith element of the input array.

Sample Input 1
7
2 4 4 4 6 8 8

Sample Output 1
4

Explanation 1
The array can be modified to [2,4,6,8] after removing all duplicates ensuring that all elements occur once. The length of this array is 4 , hence 4 is the output.

Sample Input 2
4
2 2 3 11

Sample Output 2
3

Explanation 2
The array can be modified to [2,3,11] after removing all duplicates ensuring that all elements occur once. The length of this array is 3 , hence 3 is the output.Z
*/

import java.util.*;

public class RemoveDuplicatesFromSortedArray {
    
    // Implement your solution by completing the below function
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1 || nums.length==0) return nums.length;
        
        int ans = 0;
        int j=0;
        
        for(int i=0; i<nums.length-1; i++){    
            if(nums[i] != nums[i+1]){
                nums[j++] = nums[i];
            }
        }
        nums[j++] = nums[nums.length -1];
        ans = j;
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = scanner.nextInt();
        scanner.close();

        int result = new RemoveDuplicatesFromSortedArray().removeDuplicates(numbers);
        System.out.print(Integer.toString(result));
    }
}
