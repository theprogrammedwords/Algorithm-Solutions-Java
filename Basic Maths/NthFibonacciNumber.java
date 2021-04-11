//Given a number n, you have to find the nth fibonacci number. The fibonacci sequence is given as 0,1,1,2,3,5,8,... where 0 and 1 are the 0th and 1st fibonacci number respectively.

import java.util.*;


class NthFibonacciNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = nthFibonacciNumber(n);
        System.out.println(ans);
    }

    static int nthFibonacciNumber( int n){

        int n1=0, n2=1, n3=0;
        if(n == 1)
            return 1;
        
        for(int i=2; i<= n; i++){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3; 
        }
    
    return n3;
    }
}
