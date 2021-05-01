/*Problem Description
Given a range [L, R] you have to count the numbers in this range(L & R inclusive) that have exactly 5 factors.

Input format
First line contains 2 space separated integers L, R - The range.

Output format
Print the count of numbers that have exactly 5 factors.

Sample Input 1
1 81

Sample Output 1
2

Explanation 1
In the range [1,81] there are 2 numbers that have exactly 5 factors i.e. 16 and 81.

16 have 1,2,4,8,16 as factors.
81 have 1,3,9,27,81 as factors.

Constraints
1 <= L <= R <= 10^18
*/

import java.util.*;

class NumbersWith5Factors {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        long l = sc.nextLong();
        long r = sc.nextLong();

        int ans = numbersWith5Factors(l, r);

        System.out.println(ans);
    }

    static int numbersWith5Factors(long l, long r) {
        int N= 200000;
        Long[] prime = new Long[200000];
        int index=0;
        index = sieve(N, prime, index);
        return countingNumbers(l,r, index, prime);

    }


    public static int sieve(int N, Long[] prime, int index){
        
        index=0;
        int[] p = new int[N+1];

        for(int i=0; i<=N; i++){
            p[i] = 1;
        }

        p[0] = p[1] = 0;
        for(int i = 2; i*i<=N; i++){
            if(p[i] ==1){
                for(int j = i*i; j<=N; j+=i){
                    p[j] =0;
            }
        }
        }

        for(int i=1; i<N; i++){
            if(p[i] ==1){
                Double d = (Math.pow(i,4));
                prime[index++] = (new Double(d)).longValue();
            }
        }
        return index;
    }

    public static int countingNumbers(Long L, Long R, int index, Long[] prime){
        int count=0;

        for(int i=0; i<index; i++){
            Long p = prime[i];
            if(p>= L && p<=R){   
                count++;
            }
        }
    return count;
    } 

}
