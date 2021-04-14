/*There are Q queries, each query can be of two types -

Insert an element in an array.

Remove and return the maximum element of the array.
*/

import java.util.*;


public class ReversePriorityQueue {

    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

    public void insert(int element) {
        pq.add(element);
    }

    public int getMax() {
        
        return pq.poll();
    }
}
