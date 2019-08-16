package tw.tsunglin.leetcode0816;

public class RemoveDuplicatesFromSortedList {
	 
	public ListNode deleteDuplicates(ListNode head) {
		ListNode previous = head;
		ListNode next = previous.next;
		
		ListNode ansHead = null;
		
		while(next!=null) {
			if(previous.val != next.val) {
				ansHead = new ListNode(previous.val);
				ansHead.next = previous;
			}
			
			previous = next;
			next = previous.next;
			
			ansHead = ansHead.next;
		}
		ansHead = previous;
		ansHead.val = previous.val;
		return ansHead;

	}
	
	public ListNode deleteDuplicates2(ListNode head) {
	    ListNode current = head;
	    while (current != null && current.next != null) {
	        if (current.next.val == current.val) {
	            current.next = current.next.next;
	        } else {
	            current = current.next;
	        }
	    }
	    return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
