package tw.tsunglin.leetcode1025;

public class MergeTwoSortedListsReview {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		ListNode currNode = new ListNode(0);
		ListNode dummy = currNode;

		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				currNode.next = l1;
				l1 = l1.next;
			} else {
				currNode.next = l2;
				l2 = l2.next;
			}

			if (l1 != null) {
				currNode.next = l1;
			}
			if(l2!= null) {
				currNode.next = l2;
			}
		}
		return dummy.next;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
