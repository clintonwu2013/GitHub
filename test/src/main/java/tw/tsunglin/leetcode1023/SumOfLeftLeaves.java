package tw.tsunglin.leetcode1023;

public class SumOfLeftLeaves {

	int sum = 0;

	public int sumOfLeftLeaves(TreeNode root) {

		return sum = sum + helper(root.left, true) + helper(root.right, false);
	}

	public int helper(TreeNode root, boolean left) {
		if (root == null) {
			return 0;
		}

		int sum = 0;
		if (root.left == null && root.right == null) {
			sum = left ? root.val : 0;
		}

		return sum + helper(root.left, true) + helper(root.right, false);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
