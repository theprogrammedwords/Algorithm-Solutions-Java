//Given a linked list, find the number of duplicate elements in the list.

import crio.ds.List.*;

public class ListNode {
   public int val;
   public ListNode next;
   public ListNode(int x) { val = x; next = null; }
}


public class Solution {
    public int countDuplicatesInALinkedList(ListNode head){
	int count = 0; 
  
    while (head.next != null) 
    { 
  
    
        ListNode ptr = head.next; 
        while (ptr != null) 
        { 
  
            if (head.val == ptr.val) 
            { 
                count++; 
                break; 
            } 
            ptr = ptr.next; 
        } 
  
        head = head.next; 
        
    }
	return count;
}
}
