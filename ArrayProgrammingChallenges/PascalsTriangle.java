/*Problem Description
Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it.

Input format
First line contains 1 non-negative integer N

Output format
Print the first N rows of Pascal’s triangle.

Sample Input 1
5

Sample Output 1
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1

Explanation 1
The number ‘2’ in 3rd row came from the addition of 1 & 1 from the 2nd row.
Similarly ‘3’ came from 1+2, 4 from 1+3 and 6 from 3+3.

Constraints
N <= 15
*/

import java.io.*;
import java.util.*;

public class PascalsTriangle {
    public List<List<Integer>> pascalsTriangle(int numRows) {

        List<List<Integer>> listInt = new ArrayList<List<Integer>>();

        
        for(int i=0; i<numRows; i++){
        List<Integer> sublist = new ArrayList<Integer>();       
            for(int j=0; j<=i; j++){
                sublist.add(binCoeff(i,j));
            }
        listInt.add(sublist);
        }
    return listInt;
    }

    public int binCoeff(int n, int k){
        if(k> n-k) 
        k = n-k;

        int res =1;
        for(int i=0; i<k; i++){
            res *= (n-i);
            res /= (i+1);
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int numRows = scanner.nextInt();
        scanner.close();

        List<List<Integer>> result = new PascalsTriangle().pascalsTriangle(numRows);
        for (List<Integer> row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
