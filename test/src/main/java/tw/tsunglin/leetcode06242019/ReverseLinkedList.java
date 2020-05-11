package tw.tsunglin.leetcode06242019;

public class ReverseLinkedList {

	public ListNode reverseList(ListNode head) {
		ListNode l1 = head;
		ListNode l2 = null;
		
		while(l1 != null) {
			ListNode temp = l1.next;
			l1.next = l2;
			l2=l1;
			l1 = temp;
		}
		return head;

	}

	public static void main(String[] args) {

	}

}
