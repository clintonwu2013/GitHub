package tw.tsunglin.leetcode1126;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeLinkedList {
	public boolean isPalindrome(ListNode head) {
		Stack<Integer> stack = new Stack<Integer>();
		Queue<Integer> queue = new LinkedList<Integer>();
		while(head != null) {
			stack.add(head.val);
			queue.add(head.val);
			head = head.next;
		}
		for(int i=0; i< stack.size(); i++) {
			if(!stack.pop().equals( queue.poll() )) {
				return false;
			}
		}
		return true;
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
