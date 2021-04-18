/*Given a linked list and a integer X. (All nodes in the linked list are unique). Remove the node in the linked list where data is equal to X.

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
class LinkedListRemove {

    ListNode head;

    LinkedListRemove() {
        this.head = null;
    }

    public void linkedListRemove(int x) {
        ListNode curr= new ListNode(head.val);    
        ListNode prev= new ListNode(curr.val);
        curr.next = head;
        
        if(curr.val == x){
            head = head.next;
            curr = head;
        }

        while(curr.next != null ){
            
            if(curr.val != x){
                prev = curr;
                curr=curr.next;
            }
            else{
                prev.next = curr.next;
                break;
            }
        }

       
    }
}
