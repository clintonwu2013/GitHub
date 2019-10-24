package tw.tsunglin.leetcode1024;

public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		ListNode dummy = new ListNode(0);
		ListNode pre = dummy;
		
		while(l1 != null && l2 != null) {
			if(l1.val <= l2.val) {
				pre.next = l1;
				l1 = l1.next;
			}else {
				pre.next = l2;
				l2 = l2.next;
			}
			pre = pre.next;
		}
		
		if(l1 != null) {
			pre.next = l1;
		}
		if(l2 != null) {
			pre.next = l2;
		}
		return dummy.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
