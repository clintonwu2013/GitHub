package tw.tsunglin.leetcode0823;

import java.util.Stack;

import tw.tsunglin.leetcode06242019.ListNode;

public class AddTwoNumbersII {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
		while(l1!=null) {
			s1.push(l1.val);
			l1 = l1.next;
		}
		while(l2!=null) {
			s2.push(l2.val);
			l2 = l2.next;
		}
		ListNode dummyHead = new ListNode(0);
		ListNode curr = dummyHead;
		int carry = 0;
		while(!s1.isEmpty() || !s2.isEmpty()) {
			int x = (!s1.isEmpty())?s1.pop():0;
			int y = (!s2.isEmpty())?s2.pop():0;
			
			int sum = x+y+carry;
			carry = sum/10;
			
			curr.next = new ListNode(sum%10);
			curr = curr.next;
		}
		if(carry>0) {
			curr.next = new ListNode(carry);
		}
		return reverse(dummyHead.next);

	}
	public ListNode reverse(ListNode head){
        ListNode currNode = head;
        ListNode prevNode = null;
        while(currNode != null) {
        	ListNode nextNode = currNode.next;
        	
        	currNode.next = prevNode;
        	prevNode = currNode;
        	currNode = nextNode;
        }
        return prevNode;
    }
	public static void main(String[] args) {
		
	}

}
