package tw.tsunglin.leetcode1107;

import tw.tsunglin.leetcode06242019.ListNode;

public class SwapNodesInPairs {
	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode tmp = head.next;
		head.next = swapPairs(tmp.next);
		tmp.next = head;

		return tmp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
