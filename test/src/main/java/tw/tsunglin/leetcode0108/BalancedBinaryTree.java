package tw.tsunglin.leetcode0108;

public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
		
		return calculate(root) != -1;
	}

	public int calculate(TreeNode root) {
		if(root == null) {
			return 0;
		}
		
		int leftDepth = calculate(root.left);
		int rightDepth = calculate(root.right);
		
		if(Math.abs(leftDepth - rightDepth)>1 || leftDepth==-1 || rightDepth == -1) {
			return -1;
		}
		return  Math.max (leftDepth, rightDepth) +1;  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
