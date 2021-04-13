//Given two numbers find the count of prime numbers between that range inclusive.

import java.util.*;

class NumberOfPrimesInRange {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int r = sc.nextInt();
        int ans = numberOfPrimesInARange(l, r);
        System.out.println(ans);
    }

    static int numberOfPrimesInARange(int l, int r) {
        int count =0;
        for(int i = l ; i<=r ; i++){
            if(isPrime(i))
            count++;
        }
        return count;
    }

    static boolean isPrime(int n)
        {
    
            if (n <= 1)
                return false;
    
            else if (n == 2)
                return true;
    
            else if (n % 2 == 0)
                return false;
    
            for (int i = 3; i <= Math.sqrt(n); i += 2)
            {
                if (n % i == 0)
                    return false;
            }
            return true;
        }

}
