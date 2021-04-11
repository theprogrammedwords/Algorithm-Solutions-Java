//Write a program that outputs the number of trailing zeroes in n!.

import java.util.*;

class TrailingZeros {

    static long findTrailingZeros(long n) {
        long count=0;
        while(n/5 >= 1){
            count += n/5;
            n = n/5;
        }
        return count;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(findTrailingZeros(n));
        
    }
}
