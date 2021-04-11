//Given a number n, you have to find the count of the numbers from 1 to n that are coprime to n.

import java.util.*;

class CoprimeNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = coprimeNumbers(n);

        System.out.println(result);

    }

    static int coprimeNumbers(int n) {
        int count=1;
        for(int i=2; i< n; i++){
            if(gcd(i,n)==1){
                count++;
            }
        }
        
        return count;
    }
    static int gcd(int a, int b){
        if(a==0)
                return b;
            return gcd(b%a, a);
}
}
