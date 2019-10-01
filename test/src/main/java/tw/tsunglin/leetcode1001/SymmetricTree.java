package tw.tsunglin.leetcode1001;

public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		return isMirror(root,root);
	}
	public boolean isMirror(TreeNode leftNode, TreeNode rightNode){
		if(leftNode == null && rightNode == null) {
			return true;
		}
		if(leftNode == null || rightNode == null) {
			return false;
		}
		return (leftNode.val == rightNode.val) && isMirror(leftNode.right,rightNode.left)
				&& isMirror(leftNode.left,rightNode.right);	
	}
	public static void main(String[] args) {
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