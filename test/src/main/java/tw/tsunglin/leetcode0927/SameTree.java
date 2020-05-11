package tw.tsunglin.leetcode0927;

public class SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		 // p and q are both null
	    if (p == null && q == null) {
	    	return true;
	    }
	    // one of p and q is null
	    if (q == null || p == null) {
	    	return false;
	    }
	    if (p.val != q.val) {
	    	return false;
	    }
	    
		TreeNode pLeftNode = p.left;
		TreeNode qLeftNode = q.left;
		TreeNode pRightNode = p.right;
		TreeNode qRightNode = q.right;
		
		
		return isSameTree(pLeftNode, qLeftNode) && 
				isSameTree(pRightNode, qRightNode);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

}
