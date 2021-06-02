/*

Problem Description
The Chefs of the restaurants are asked to prepare Pizzas for their customers. The Restaurant has N chefs and each chef has a rank R(1<=R<=10). A chef with a rank R can cook x Pizzas in F(x) minutes by the given function.
F(x) = R * x * x.

Where F(x) is the time taken in minutes to make x pizzas and R is the rank of the chef.
The waiter has already taken the orders and wants to know the minimum time to get the orders done.
Note: All the chefs can make Pizzas parallelly.

Input format
First line will have two space separated integers representing and N number of Chefs respectively and P number of Pizzas ordered .
The second line will have N space separated integers representing the respective ranks of N chefs.

Output format
Print a single integer which tells the number of minutes needed to get the order done.

Sample Input 1
4 10
1 2 3 4

Sample Output 1
16

Explanation 1
First chef will make 4 pizzas taking 16 minutes, and the rest 2nd, 3rd and 4th chefs will take 2 pizzas each.

Constraints
1<=N<=10000
1<=P<=10000
1<=Rank[i]<=10

*/

import java.util.*;

class ProfitSearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();

        int rank[] = new int[n];

        for (int i = 0; i < n; i++) {
            rank[i] = sc.nextInt();
        }

        int res = profitSearch(n, p, rank);

        System.out.println(res);
    }

    static int profitSearch(int n, int p, int rank[]) {
        int max1 = -1;

        //Maximum time taken if all pizzas given to a single chef
        for(int i=0; i<n ; i++){ 
            max1 = Math.max(max1, cost(rank[i], p)); }
            //System.out.println(max1 + " "+ cost(rank[i], p));
        
            int low = 0;
            int high = max1+10;
            int ans = max1;

            while(low <= high){
                int mid = (low + high)/2;
                if(check(rank, mid, p, n )) {
                    ans = mid;
                    high = mid-1;
                }
            else {
                low = mid + 1;
            }
        }
        return ans;   
}

    static int cost(int rank, int x){ 
        //Finds the value of time function
        int res;
        res = rank*(x*x );
        return res;
    }

    static boolean check(int[] rank, int tim, int p, int n){
        int count = 0;
        for(int k=0; k < n; ++k){
        count += canMakeinGivenTime(tim, rank[k]); 
    }
    
    return (count>=p);
    }

    static int canMakeinGivenTime(int tim, int rank){

        int low =0;
        int high = 10001;
        int ans = -1;

        while(low <= high){
            int mid = (low + high)/2;
            if(cost(rank, mid ) <= tim){
                ans = mid;
                low = mid + 1;

            }else {
                high = mid -1;
            }
        }
        return ans;
        }
    }
