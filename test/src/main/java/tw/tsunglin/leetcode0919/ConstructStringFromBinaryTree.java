package tw.tsunglin.leetcode0919;

public class ConstructStringFromBinaryTree {
	StringBuilder sb = new StringBuilder();

	public String tree2str(TreeNode t) {
		if (t == null) {
			return "";
		}

		if (t.left == null && t.left == null) {
			return t.val+"";
		}
		if (t.right == null) {
			return t.val + "(" + tree2str(t.left) + ")";
		}
		return t.val + "("+tree2str(t.left)+")"+"("+tree2str(t.right)+")";

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