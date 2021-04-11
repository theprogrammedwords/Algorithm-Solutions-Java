/*Given a matrix of dimension n x n having elements 1 to n x n distinct elements. Check whether the matrix is magic square or not.

Magic square is a square that has the same sum of rows, columns and diagonals.*/


import java.util.*;

class CheckMagicSquare {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int grid[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        }

        String result = checkMagicSquare(n, grid);

        System.out.println(result);

    }

    static String checkMagicSquare(int n, int[][] grid) {
        int colsum=0, diasum1=0, rowsum=0, diasum2=0;
        String var="";

        
        for(int i=0; i<grid.length;i++){
                diasum1 += grid[i][i];
        }
        for(int i=0; i<grid.length;i++){
                diasum2 += grid[i][n-1-i];
        }
        if(diasum1 != diasum2){
                var="No";
        }

        for(int i=0; i<grid.length; i++){
            rowsum =0;
            colsum =0;

            for(int j=0; j<grid.length; j++){
                rowsum += grid[i][j];
                colsum += grid[j][i];
            }
            if(rowsum != colsum ){
                var = "No";
                rowsum =0;
                colsum =0;
                break;
            }
            
        }
                if(rowsum == colsum && diasum1 == rowsum && colsum==diasum1 ){
                    //System.out.println(" "+ rowsum+ " "+ colsum+ " "+diasum);
                    var="Yes";
                }else{
                    var ="No";
                }


    return var;
    }
}
