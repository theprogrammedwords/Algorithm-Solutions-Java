//Reverse the given linked list.

import crio.ds.List.ListNode;
import java.util.*;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) {
        val = x;
        next = null;
    }
}


class LinkedListReverse {

    public ListNode linkedListReverse(ListNode head) {
    ListNode curr = head;
    ListNode prev = null;
    ListNode next = null;

    while(curr != null){
        next= curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    head = prev;
    return head;

    }
};
