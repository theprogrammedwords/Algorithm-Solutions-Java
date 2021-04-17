//Implement the insertAtEnd and insertAtBeginning functionality of a linked list.

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
class LinkedListInsertion {

    ListNode head;
    ListNode tail;

    LinkedListInsertion() {
        this.head = this.tail = null;
    }

    public void insertAtBeginning(int data) {
        ListNode node = new ListNode(data);
        node.next = head;
        head = node;
    }

    public void insertAtEnd(int data) {
        ListNode node = new ListNode(data);   
        
        if (head == null)
        {
            head = new ListNode(data);
        }
        else if(head != null){
            node.next = null;
            ListNode n = head;
            
            while(n.next !=null ){
                n = n.next;
            }
        n.next = node;
        }   

    }
}
