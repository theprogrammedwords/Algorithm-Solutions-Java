/*Problem Description
You are given an Array A of size N. You have to pick total B elements from either left or right end of the array A to get the maximum sum.

Input format
First line will contain two space separated integers N and B respectively.
Second line will contain N space separated integers array A.

Output format
Print the answer in a single line.

Sample Input 1
5 4
4 -3 1 2 1

Sample Output 1
8

Explanation
4 + 1 + 2 + 1 = 8

We will have the maximum sum for one element from the first side and three elements from the back.

Constraints
1<=N<=1000000
-1000000<=Ai<=1000000
0<=B<=N
*/

import java.util.*;


class PickLargestSum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        List<Integer> A = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }
        long result = pickLargestSum(N, B, A);
        System.out.println(result);
        sc.close();
    }

    static long pickLargestSum(int N, int B, List<Integer>A){
        long sum1 = 0L;
        long sum2 = 0L;
        long min1;
        for(int i=0; i<A.size(); i++){
            sum1 += (long) A.get(i);
        }        


        int i=0;
        int j = N-B-1;

        for(int k=i; k<=j; k++){
            sum2 += (long) A.get(k); 
        }
        
        min1 = (long) sum2;
        i++;
        j++;

        while(j<A.size()){
            sum2+= (long) A.get(j) - A.get(i-1);
            min1 = Math.min(sum2, min1);
            i++;
            j++;
        }
        return (sum1-min1);
    }
}
