package tw.tsunglin.leetcode1210;

import tw.tsunglin.leetcode06242019.ListNode;

public class RotateList {
	public ListNode rotateRight(ListNode head, int k) {
		if(k==0||head==null) {
			return head;
		}
	    ListNode p=head;
	    ListNode q=head;
	    int step=0;
	    while(step<k&&q!=null){
	        q=q.next;
	        step++;
	    }
	    if(q==null){
	        return rotateRight(head, k%step);
	    }
	    else{
	        while(q.next!=null){
	            p=p.next;
	            q=q.next;
	        }
	        q.next=head;
	        head=p.next;
	        p.next=null;
	    }
	    return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
