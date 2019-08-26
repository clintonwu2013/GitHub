package tw.tsunglin.leetcode0826;

import tw.tsunglin.leetcode06242019.ListNode;

public class QueueLinkedListImpl {
	
	ListNode frontNode=null;
	ListNode rearNode=null;
	
	
	public boolean isEmpty() {
		return frontNode==null;
	}
	public void push(Integer val) {
		if(isEmpty()) {
			frontNode = new ListNode(val);
			rearNode= frontNode;
		}else {
			rearNode.next = new ListNode(val);
			rearNode = rearNode.next;
		}
		
	}
	
	public ListNode pop() {
		if(isEmpty()) {
			throw new IllegalStateException("queue is empty!!!");
		}if(frontNode == rearNode){
			ListNode record = frontNode;
			frontNode = null;
			rearNode = null;
			return record;
		}else {
			ListNode record = frontNode;
			frontNode = frontNode.next;
			return record;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
