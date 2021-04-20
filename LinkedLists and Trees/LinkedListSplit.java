//Given a linked list. Split it into two lists such that all the nodes with even data are in one list and others are in another list.

import crio.ds.List.ListNode;
import java.util.*;

/*
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) {
        val = x;
        next = null;
    }
}

Use new ListNode(data) to create new node
*/
class LinkedListSplit {

    public List<ListNode> linkedListSplit(ListNode head) {
        
        List<ListNode> ln = new ArrayList<ListNode>();

        ListNode even = new ListNode(0);
        ListNode odd = new ListNode(0);
        
        while(head != null){
            if(head.val %2 == 0){

                even = insertAtEnd(even, head.val);
            }else{
                odd= insertAtEnd(odd, head.val);
            }
            head = head.next;
        }

        
        ln.add(odd.next);
        ln.add(even.next);
    return ln;

    }


    public ListNode insertAtEnd(ListNode node, int data){
        ListNode newnode = new ListNode(data);
        if(node == null){
            return newnode;
        }
        ListNode current = node;
        while(null != current.next){
            current = current.next;
        }

        current.next = newnode;
        return node;
    }
};
