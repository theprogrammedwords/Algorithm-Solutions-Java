/*Problem Description
Given an integer array nums, you need to sort the elements of the array based on the absolute value of the elements.

Input format
First line contains an integer n - The number of elements.
Second line contains n space separated integers - The array nums.

Output format
For each test case print the minimum changes required on a separate line.

Sample Input 1
5
2 -5 1 -2 4

Sample Output 1
1 2 -2 4 -5

Explanation 1
Absolute values of elements are [2,5,1,2,4] respectively, so in the sorted order based on absolute values elements will be [1,2,-2,4,-5] or [1,-2,2,4,-5]. Both are accepted answers.

Constraints
1 <= n <= 10^5
-10^9 <= nums[i] <= 10^9
*/


import java.util.*;

class SortArrayAbsolute {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int res[] = sortArrayAbsolute(n, arr);

        for (int j : res)
            System.out.print(j + " ");
    }

    static int[] sortArrayAbsolute(int n, int arr[]) {
        Vector<Integer> vect = new Vector<>();

        for(int i=0; i<arr.length; i++){
            vect.add(arr[i]);
        }

         Collections.sort(vect, new Comparator<Integer> (){
            @Override public int compare(Integer A, Integer B){
                Integer one = Math.abs(A);
                Integer two = Math.abs(B);

                return one-two;
            } 
         });

         int[] result = new int[arr.length];

        for(int i=0; i<result.length; i++){
            result[i]= vect.get(i);
        }
    

    return result;
    }
}
