package tw.tsunglin.leetcode1007;

public class MaximumDepthOfBinaryTree {
	int maxDepth = 0;
	public int maxDepth(TreeNode root) {
		
		if(root == null) {
			return 0;
		}
		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
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