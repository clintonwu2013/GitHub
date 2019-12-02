package tw.tsunglin.leetcode1202;

public class PartitionList {
	public ListNode partition(ListNode head, int x) {
		ListNode listNode1 = new ListNode(0);
		ListNode listNode2 = new ListNode(0);
		ListNode dummy1 = listNode1;
		ListNode dummy2 = listNode2;
		
		while( head != null) {
			if(head.val<x) {
				listNode1.next = new ListNode(head.val);
                listNode1 = listNode1.next;
			}else {
				listNode2.next = new ListNode(head.val);
                listNode2 = listNode2.next;
			}
			head = head.next;
		}
		
		listNode1.next = dummy2.next;
		
		return dummy1.next;
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
