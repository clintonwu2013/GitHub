package tw.tsunglin.leetcode1202;

public class ReverseLinkedList {
	public ListNode reverseBetween(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;
		
		while( curr != null) {
			ListNode tmp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = tmp;
		}
		return prev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}



