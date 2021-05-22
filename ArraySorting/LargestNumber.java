/*

Problem Description
Given a list of non-negative integers, arrange them such that they form the largest number.

Input format
First-line will contain an integer n denoting the number of numbers in the list.
Next line will contain n space-separated integers.

Output format
Print the largest number formed by arranging these numbers in the list.

Sample Input 1
2
10 2

Sample Output 1
210

Sample Input 2
5
3 30 34 5 9

Sample Output 2
9534330

Constraints
0<= n <=50000
0<= a[i] <= 1e4
*/

import java.util.*;
import java.util.Scanner;

class LargestNumber {
    public String largestNumber(int[] nums) {

/*
    O(n^2) logic

        String result = "";

        for(int i=0; i< nums.length; i++){
            for(int j= i+1; j< nums.length; j++){
                String AB = nums[i] +""+ nums[j];
                String BA = nums[j] +""+ nums[i];

                if(Integer.parseInt(BA) > Integer.parseInt(AB)){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for(int i=0; i<nums.length; i++){
            result =  result + ""+ nums[i];
        }
        */
        String result = "";

        Vector<String> arr = new Vector<>(); 

        for(int i=0; i<nums.length; i++){
            arr.add(nums[i] +"");
        }

        Collections.sort(arr, new Comparator<String> (){
            @Override public int compare(String A, String B){
                String AB = A + B;
                String BA = B + A;

                return AB.compareTo(BA) > 0 ? -1 : 1;
            } 
        });

        for(int i=0; i< arr.size(); i++){
            result += arr.get(i);
        }
        return result;
    }

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        String result = new LargestNumber().largestNumber(nums);

        System.out.println(result);
    }

}
ˇ
