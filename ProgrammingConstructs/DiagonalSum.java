/*Given a matrix of dimension n x n. Find the sum of elements present at the principal diagonal of the matrix. 
Principal diagonal is the diagonal that starts at left top(0,0),(1,1) and goes all the way to right bottom (n-1,n-1).*/

import java.util.*;

class DiagonalSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        }

        int result = diagonalSum(n, a);
        System.out.println(result);
    }

    static int diagonalSum(int n, int[][] a) {
        int prinsum = 0;
        for(int i=0; i< a.length;i++){
            prinsum += a[i][i];
        }
    return prinsum;   
    }
}
