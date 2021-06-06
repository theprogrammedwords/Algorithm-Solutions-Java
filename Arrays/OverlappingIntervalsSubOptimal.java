/*
An interval is a pair of values that represents all numbers between those two.


You are given N intervals. You need to print the farthest located interval distance that are non overlapping. If there is no non-overlapping pair of intervals present, return -1


Note: Distance between two intervals is defined by the absolute difference between the end point of the left interval and start point of the right interval.


A distance of 0 means that they’re NOT overlapping. For instance, [1, 3] and [3, 4] are not considered overlapping.

Input format
There are N+1 lines of input

First line contains a single integer N. Next N lines will contain two integers, l and r, representing the start and end point of the interval respectively.

Output format
Print the farthest distance or -1 if no overlapping intervals are present.

Sample Input 1
3

1 2

3 5

6 7

Sample Output 1
4

Explanation
The pair of intervals [1,2] & [6,7] are farthest. And the distance between them will be 6 - 2 = 4

Constraints
1<=N<=10^5

1<=l<=r<=10^6
*/

import java.util.*;
class OverlappingIntervalsSubOptimal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> intervals = new ArrayList<ArrayList<Integer>>(n);
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            intervals.add(new ArrayList<Integer>(Arrays.asList(x, y)));
        }
        int result = overlappingIntervals(n, intervals);
        System.out.println(result);
    }
    static int overlappingIntervals(int n, ArrayList<ArrayList<Integer>> intervals) {

        Collections.sort(intervals, (i1, i2) -> {
            if( (i1.get(0) - i2.get(0) ) != 0 ){
                return i1.get(0) - i2.get(0);
            } else {
                return i1.get(1) - i2.get(1);
            }
        });

        if(intervals.get(intervals.size()-1).get(0) >= intervals.get(0).get(1) )
            return intervals.get(intervals.size()-1).get(0) - intervals.get(0).get(1);
        else return -1;
    }
}
