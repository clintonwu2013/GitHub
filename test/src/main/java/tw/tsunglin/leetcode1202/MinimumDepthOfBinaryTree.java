package tw.tsunglin.leetcode1202;

public class MinimumDepthOfBinaryTree {
	public int minDepth(TreeNode root) {
		if(root == null) {
			return 0;
		}
		if(root.left == null) {
			return 1+minDepth(root.right);
		}
		if(root.right == null) {
			return 1+minDepth(root.left);
		}
		
		
		return 1 + Math.min(minDepth(root.left), minDepth(root.right));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
