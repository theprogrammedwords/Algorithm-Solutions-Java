/*Given a sorted array nums, remove the duplicates in-place such that each element in the array appears at most twice and return the new length.
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Input format
First line contains an integer n - Number of elements.
Second line contains n space separated integers - The array nums.

Output format
Print the new length in the first line.
In the second line print the nums array upto the new length.

Sample Input 1
7
2 2 2 3 4 4 9

Sample Output 1
6
2 2 3 4 4 9

Explanation 1
Your function should return 6 as the element 2 can only be present at most 2 times. So the first 6 elements of array nums should be modified to [2, 2, 3, 4, 4, 9]. Rest of the elements present beyond this point doesn't matter.

Constraints
1 <= n <= 10^5
0 <= nums[i] <= 10^6
*/

import java.util.*;

class RemoveDuplicatesFromSortedArrayII {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int res = removeDuplicatesFromSortedArrayII(n, arr);

        System.out.println(res);

        for (int i = 0; i < res; i++)
            System.out.print(arr[i] + " ");

    }

    static int removeDuplicatesFromSortedArrayII(int n, int[] arr) {
        
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        List<Integer> alist = new ArrayList<Integer>();
        int index = 1;

        for(int i=0; i<arr.length; i++){    
            if(!hmap.containsKey(arr[i])){
                hmap.put(arr[i], index);
            }else if(hmap.containsKey(arr[i])){
                hmap.put(arr[i], hmap.get(arr[i])+1);
            }
 
            if(hmap.get(arr[i]) > 2){
                alist.add(i);
            }
        }

        int counter =0;
        for(int i =0; i<alist.size(); i++){
            removeFromArray(arr,alist.get(i)-i);
            counter++;
        }

    return arr.length-counter;
    }


    public static void removeFromArray(int[] arr, Integer indices){

        for(int i=0; i<arr.length; i++){
            if(i == indices){
                int iter=i;
                while(iter != arr.length-1){
                    arr[iter] = arr[iter +1];
                    iter++;
                }
                arr[iter] = 0;
            }
        }
    }

}
