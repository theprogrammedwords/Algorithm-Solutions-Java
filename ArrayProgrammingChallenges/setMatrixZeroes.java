/*Given a m x n matrix, if an element is 0, set its entire row and column to 0.

Do it in-place.

Input format
First line contains 2 integers m,n - number of rows and columns respectively.

Next m lines contain space separated n integers.

Output format
Output the same matrix.

Sample Input 1
3 3
1 1 1
1 0 1
1 1 1

Sample Output 1
1 0 1
0 0 0
1 0 1

Explanation 1
There is one ‘0’ in 2nd row and 2nd column, so all the elements in that row and column become 0.

Sample Input 2
3 4
0 1 2 0
3 4 5 2
1 3 1 5

Sample Output 2
0 0 0 0
0 4 5 0
0 3 1 0

Explanation 2
1st row, 1st column and 4th column all contains ‘0’, so all the values in these rows & columns becomes 0.

Constraints
M,N <= 500
*/

import java.io.*;
import java.util.*;

class SetMatrixZeroes {
    public void setMatrixZeroes(int[][] matrix) {
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[][] matrix = new int[n][m];

        for(int i = 0 ; i < n ; ++i) {
            for(int j = 0 ; j < m ; ++j) {
                matrix[i][j] = in.nextInt();
            }
        }
        in.close();
        new SetMatrixZeroes().setMatrixZeroes(matrix);

        List<Integer> rowVal = new ArrayList<Integer>();
        List<Integer> colVal = new ArrayList<Integer>();
        for(int i = 0 ; i < n ; ++i) {
            for(int j = 0 ; j < m ; ++j) {
                if(matrix[i][j] ==0){
                    rowVal.add(i);
                    colVal.add(j);
                }
            }
        }

        for(int i=0; i<rowVal.size(); i++){
            int index=0;
            while(m >index){
                matrix[rowVal.get(i)][index] = 0;
                index++;
            }
        }

        for(int i=0; i<colVal.size(); i++){
            int index=0;
            while(n >index){
                matrix[index][colVal.get(i)] = 0;
                index++;
            }
        }


        for(int i = 0 ; i < n ; ++i) {
            for(int j = 0 ; j < m ; ++j) {
    
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }



    }
}
