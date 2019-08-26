package tw.tsunglin.leetcode0826;

import tw.tsunglin.leetcode06242019.ListNode;

public class StackImpl {
	ListNode currNode = null;
	
	public boolean isEmpty() {
		return currNode == null;
	}
	public void push(Integer val) {
		if(isEmpty()) {
			currNode = new ListNode(val);
		}else {
			ListNode oldCurrNode = currNode;
			currNode = new ListNode(val);
			currNode.next = oldCurrNode;
			
		}
	}
	
	public ListNode pop() {
		if(isEmpty()) {
			throw new IllegalStateException("stack is empty");
		}else {
			ListNode record = currNode;
			currNode = currNode.next;
			
			return record;
		}
		
	}
}
