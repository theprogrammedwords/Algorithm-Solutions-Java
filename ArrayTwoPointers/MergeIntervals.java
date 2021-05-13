/*Problem Description
Given a collection of intervals, merge all overlapping intervals.
Note: The merged intervals should be printed in sorted order (using interval start as the key)

Input format
First line contains N, the number of intervals
Next N lines contain 2 space separated integers A and B, which represent the start and end of an interval

Output format
For the X merged intervals, print each interval (the start and end being space separated) on a separate line

Constraints
1 <= N <= 50000
0 <= A, B <= 1e9
B >= A

Sample Input 1
4
1 3
2 6
8 10
15 18

Sample Output 1
1 6
8 10
15 18

Explanation 1
Since intervals [1 3] and [2 6] overlap, merge them into [1 6]

Sample Input 2
2
1 4
4 5

Sample Output 2
1 5

Explanation 2
Intervals [1 4] and [4 5] overlap and get merged into [1 5]
*/

import java.util.*;

class MergeIntervals {

    public int[][] mergeIntervals(int[][] intervals) {

        sortByColumn(intervals, 0);

        int index=0;

        for(int i=1; i<intervals.length; i++){
            if(intervals[index][1] >= intervals[i][0]){
            intervals[index][1] =Math.max(intervals[index][1], intervals[i][1]);
            intervals[index][0] =Math.min(intervals[index][0], intervals[i][0]);
            }else{
                index++;
                intervals[index][0] = intervals[i][0];
                intervals[index][1] = intervals[i][1];
            }
        }

        int[][] result = new int[index+1][intervals[0].length];
        for(int i=0; i<=index; i++){
            result[i][0] = intervals[i][0];
            result[i][1] = intervals[i][1];
        }
        
    return result;
    }

    public static void sortByColumn(int arr[][], int column){
            
            Arrays.sort(arr, new Comparator<int[]>() {
                @Override
                public int compare(final int[] n1, final int[] n2){
                    if(n1[column] > n2[column]) 
                        return 1;
                    else
                        return -1;
                }
            });
    }


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] nums = new int[n][2];

        for(int i = 0 ; i < n ;i++) {
            nums[i][0] = scanner.nextInt();
            nums[i][1] = scanner.nextInt();
        }

        int[][] results = new MergeIntervals().mergeIntervals(nums);

        for (int i = 0; i < results.length; ++i) {
            System.out.printf("%d %d\n", results[i][0], results[i][1]);
        }
    }
}
