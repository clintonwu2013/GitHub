package tw.tsunglin.leetcode1028;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int sum = 0;
		ListNode ans = new ListNode(0);
		ListNode dummy = ans;
		while (l1 != null || l2 != null) {
			if (l1 != null) {
				sum = sum + l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				sum = sum + l2.val;
				l2 = l2.next;
			}
			ans.next = new ListNode(sum % 10);
			ans = ans.next;
			sum = sum / 10;

		}

		if (sum != 0) {
			ans.next = new ListNode(sum);
		}
		return dummy.next;

	}

	public static void main(String[] args) {

	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
