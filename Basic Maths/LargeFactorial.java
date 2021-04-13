//Given an integer find the factorial of the number.

import java.util.*;
class LargeFactorial {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans[] = largeFactorial(n);
        for (int j : ans)
            System.out.print(j);

    }

    static int[] largeFactorial(int n) {
        int[] res = new int[500];
        res[0] = 1;
        int res_size = 1;

        for(int x = 2 ; x <=n ; x++){
            res_size = multiply(x,res, res_size);
        }

    return reverse(res, res_size);
    }

    static int multiply(int x, int[] res, int res_size){
        int carry = 0;
        int prod = 0;
        for(int i=0; i<res_size; i++){
            prod = res[i] * x + carry; 
            res[i] = prod % 10; 
            carry = prod/ 10;
        }

        while(carry != 0){
            res[res_size] = carry % 10;
            carry = carry/ 10;
            res_size++;
        }
    
        return res_size;
    }

    static int[] reverse(int[] res, int res_size){
        int[] b = new int[res_size];
        int j = res_size;

        for(int i=0; i< res_size; i++){
            b[j-1] = res[i];
            j = j-1;
        }
    return b;    
    }  

}
