/*There is an array of N elements. Perform the following operation until there are only two elements left in the array.

Remove the largest and second largest element from the array and insert their absolute difference back in the array.
*/

import java.util.*;


class ReduceArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i=0;i<n;i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        int ans = reduceArray(n, a);
        System.out.println(ans);
    }

    static int reduceArray(int n, int a[]){
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i< a.length;i++){
            pq.add(a[i]);
        }

        // System.out.println(pq);
        int diff = 0;
        while(pq.size() > 1){
            diff = pq.poll() - pq.poll();
            diff = Math.abs(diff);
            pq.add(diff);
         //   System.out.println(pq);
        }

        
    return pq.peek();
    }
}
