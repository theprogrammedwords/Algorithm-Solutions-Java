//Given an unsorted integer array, find the smallest missing positive integer.

import java.util.*;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        
        Set<Integer> set=new HashSet<>();
        for(int i: nums){
            if(i>0 && i<Integer.MAX_VALUE){
                set.add(i);
            }
        }
        if(!set.contains(1)){
            return 1;
        }
        int res=Integer.MAX_VALUE;
        for(int i: set){
            if (!set.contains(i+1)){
                res=Math.min(res, i+1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i < n ; ++i) {
            nums[i] = in.nextInt();
        }
        int result = new FirstMissingPositive().firstMissingPositive(nums);
        System.out.println(result);
    }
}

