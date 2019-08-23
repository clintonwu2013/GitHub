package tw.tsunglin.leetcode0823;

import java.util.HashSet;
import java.util.Set;

import tw.tsunglin.leetcode06242019.ListNode;

public class IntersectionOfTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		Set<Integer> set = new HashSet<Integer>();
		while(headA!=null ) {
			set.add(headA.hashCode());
			headA=headA.next;
		}
		
		while(headB!=null) {
			if(set.contains(headB.hashCode())) {
				return headB;
			}
			headB= headB.next;
		}
		return null;
	}

	public static void main(String[] args) {

	}

}
