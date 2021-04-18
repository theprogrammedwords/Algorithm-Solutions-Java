/*Problem Description
Given a linked list and an element X. Find if there exist a node in the linked list with data equal to X.

Input format
First line contains N size of the linked list.

Next line contains N space separated integers describing the linked list.

Next line contains a single integer X.
*/

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
class linkedListSearching {

    public boolean linkedListSearch(ListNode head, int x) {
        ListNode curr = new ListNode(x);
        while(head.next != null){
            if(head.val != curr.val){
                head = head.next;
            }else if(head.val == curr.val){
                return true;
            }
        }
        if(head.next == null){
            return false;
        }
    return false;
    }
};
