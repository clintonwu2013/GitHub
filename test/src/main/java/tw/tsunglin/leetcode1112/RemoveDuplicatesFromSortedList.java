package tw.tsunglin.leetcode1112;

import tw.tsunglin.leetcode06242019.ListNode;

public class RemoveDuplicatesFromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode current = head;
        
        while(current!=null && current.next!=null){
            if(current.val == current.next.val){
                current.next = current.next.next;
            }else{
                current=current.next;
            }
        }
        return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
