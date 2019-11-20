package tw.tsunglin.leetcode1114;

import tw.tsunglin.leetcode06242019.ListNode;

public class RemoveDuplicateFromSortedListII {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode d = new ListNode(0);
		d.next = head;
		ListNode h = d;
		ListNode p1 = d.next;
		ListNode p2 = p1;
		while (p2 != null) {
			p2 = p2.next;
			if (p2 != null && p1.val == p2.val) {
				while (p2 != null && p2.val == p1.val) {
					p2 = p2.next;
				}
			}
			else {
				h.next = p1;
				h = h.next;
			}
			p1 = p2;
		}
		h.next = null;
		return d.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
