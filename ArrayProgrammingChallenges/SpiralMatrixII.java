//Given an integer A, generate a square matrix filled with elements from 1 to A*A in spiral order. The spiral order will be clockwise in nature starting from (0,0)

import java.util.*;

class SpiralMatrixII {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result[][] = spiralMatrixII(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] spiralMatrixII(int n) {
        int top=0, down=n-1, left=0, right=n-1;
        int direction=1;

        int[][] spiral = new int[n][n];
        int[] numbers= new int[n*n];

        for(int i=0; i<n*n; i++){
            numbers[i] = i+1;
        } 

        int index =0;
        while(top <= down && left<=right)
        {   
            if(direction ==1){
                for(int i =left; i<=right; ++i){
                    spiral[top][i] = numbers[index];
                    index++;
                }
            ++top;
            direction =2;
            }
            if(direction == 2){
                for(int i=top; i<=down; ++i ){
                    spiral[i][right] = numbers[index];
                    index++;
                }
            --right;
            direction=3;
            } 
            if(direction ==3){
                for(int i=right; i>=left; --i){
                    spiral[down][i] = numbers[index];
                    index++;
                }
            --down;
            direction=4;
            }
            if(direction==4){
                for(int i=down;i>=top; --i){
                    spiral[i][left] = numbers[index];
                    index++;
                }
            ++left;
            direction=1;
            }
        }
        return spiral;
    }


}
