package tw.tsunglin.leetcode0911;

public class InvertBinaryTree {
	public TreeNode invertTree(TreeNode root) {
		TreeNode right = invertTree(root.right);
		TreeNode left = invertTree(root.left);
		
		root.right = left;
		root.left  = right; 
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
