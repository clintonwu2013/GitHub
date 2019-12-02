package tw.tsunglin.leetcode1202;

public class ReverseLinkedListII {
	
	public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null) {
        	return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        for(int i = 1; i < m; i++) {
        	pre = pre.next;
        }
        
        ListNode cur = pre.next;
        ListNode next = cur.next;
        // dummy -> 1 -> 2 -> 3 -> 4 -> 5
        //         pre  cur  next
        
        // dummy -> 1 -> 3 -> 2 -> 4 -> 5
        //         pre       cur  next
        
        // dummy -> 1 -> 4 -> 3 -> 2 -> 5
        //         pre            cur  next
        for(int i = 0; i < n - m; i++) {
            cur.next = next.next;
            next.next = pre.next;
            pre.next = next;
            next = cur.next;
            
        }
        return dummy.next;
    }

	public static void main(String[] args) {
		

	}

}

//class ListNode {
//	int val;
//	ListNode next;
//
//	ListNode(int x) {
//		val = x;
//	}
//}
