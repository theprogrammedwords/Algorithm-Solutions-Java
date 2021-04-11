//Given a number N, you have to find the largest Fibonacci number which is less than N.

import java.util.*;


class LargestFibonacciNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int result = largestFibonacciNumber(n);
            System.out.println(result);
        }
        sc.close();
    }

    static int largestFibonacciNumber(int n){
        int n1=0, n2=1, n3=0;
        while(n1+n2<n){
            n3 = n1+n2;
            n1=n2;
            n2=n3;
            if(n3>n)
                break;
        }
        return n3;
    }
}
