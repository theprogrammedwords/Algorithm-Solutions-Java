/*Given a matrix M, you need to find the forward diagonal having maximum sum. Forward diagonal starts in the left most column or the top most row and ends at the bottom most row or the right most column.

In the following figure there are 6 forward diagonals and the green diagonal is having the maximum sum.

*/


import java.util.*;


class LargestForwardDiagonal{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<Integer>> M = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer>temp = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                temp.add(sc.nextInt());
            }
            M.add(temp);
        }
        int result = largestForwardDiagonal(M);
        System.out.println(result);
        sc.close();
    }

    static int largestForwardDiagonal(ArrayList<ArrayList<Integer>>M){
    int maxSum = 0;
    // Traverse through the columns
    for(int i = 0; i <M.size(); i++)
    {
        // Initialize r and c
        int row = 0, col = i;
        int sum1 = 0, sum2 = 0;
        while (col < M.size() && row < M.size())
        {
            sum1 += M.get(col).get(row);
//            sum2 += M.get(row).get(col);
            row++;
            col++;
    
        }
        row = 0;
        col = i;
        while (col < M.get(0).size() && row < M.size())
        {
            sum2 += M.get(row).get(col);
            row++;
            col++;
    
        }
        // Update maxSum with
        // the maximum sum
        maxSum = Math.max(maxSum,
                          Math.max(sum1,
                                   sum2));
//        System.out.println(sum1 + " "+sum2);
    }
 
    // Return the maxSum
    return maxSum;
}
}
