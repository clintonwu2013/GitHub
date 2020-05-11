package tw.tsunglin.leetcode1112;

import tw.tsunglin.leetcode06242019.ListNode;

public class RemoveDuplicatesFromSortedListII {
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null) {
			return null;
		}

	    ListNode res = new ListNode(0);
	    res.next = head;
	    ListNode prev = res;
	    ListNode curr = head;
	    
	    int count = 1;

	    while(curr.next != null) {
	        if(curr.next.val == curr.val) {
	            count++;
	        } else {
	            if(count == 1) {
	                prev.next = curr;
	                prev = curr;
	            } else {
	                count = 1;
	            }
	        }
	        curr = curr.next;
	    }
	    if(count == 1) {
	    	prev.next = curr;
	    }else {
	    	prev.next = null;
	    }
	    return res.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
