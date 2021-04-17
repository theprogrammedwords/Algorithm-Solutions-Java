//Implement the insertAtEnd and insertAtBeginning functionality of a linked list.

import crio.ds.List.ListNode;
import java.util.*;

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
class Solution {

    ListNode head;
    ListNode tail;

    Solution() {
        this.head = this.tail = null;
    }

    public void insertAtBeginning(int data) {
        ListNode node = new ListNode(data);
        if (head == null)
        {
            head = node;
            tail = node;
        }else{
            node.next = head;
            head = node;       
        }
    }

    public void insertAtEnd(int data) {
        
        ListNode node = new ListNode(data);   
       //logic to add the element using tail
        if (head == null)
        {
            head = node;
            tail = node;
        }else{
            tail.next = node;
            tail = node;
        }

      //logic to add the element using traversal
      /*  else if(head != null){
            node.next = null;
            ListNode n = head;
            
            while(n.next !=null ){
                n = n.next;
            }
        n.next = node;
        }   
        */

    }
}
