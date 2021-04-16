/*Implement a queue.

There are Q queries, each query can be of two types -

Insert an element at the back in an array.

Remove and return the first element of the array.
*/
import java.util.*;

class QueueSimple {
    Queue<Integer> q1 = new LinkedList<Integer>();
    
    public void insert(int element) {
        q1.add(element);
    }

    public int getFirst() {
    return q1.poll();
    
    }
};
