package tw.tsunglin.leetcode1001;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
		Set<ListNode> set = new HashSet<ListNode>();
		
		while(head != null) {
			if(set.contains(head)) {
				return true;
			}
			set.add(head);
			head = head.next;
		}
		return false;

	}
	
	public boolean hasCycle2(ListNode head) {
		Set<ListNode> set = new HashSet<ListNode>();
		
		while(head != null) {
			if(set.contains(head)) {
				return true;
			}
			set.add(head);
			head = head.next;
		}
		return false;

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
		next = null;
	}
}