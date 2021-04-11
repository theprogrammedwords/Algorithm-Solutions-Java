//Given an integer find the number of divisors of that number and also print the sum of divisors.

import java.util.*;


class NumberOfDivisorsAndSum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans[] = numberOfDivisorsAndSum(n);
        System.out.println(ans[0] + " " + ans[1]);
    }

    static int[] numberOfDivisorsAndSum(int n){
        int[] result = new int[2];
        for(int i=1; i<= n; i++){
            if(n % i == 0){
                result[0]++;
                result[1]+=i;
            }
        }
    return result;
    }
}
