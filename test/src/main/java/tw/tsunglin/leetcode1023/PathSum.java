package tw.tsunglin.leetcode1023;

public class PathSum {
	boolean flag = false;
	public boolean hasPathSum(TreeNode root, int sum) {
		if(root == null) {
			return false;
		}
		
		int total = 0;
		traverse(root, sum , total);
		
		
		return flag;
	}

	private void traverse(TreeNode root, int sum, int total) {
		total = total + root.val;
		
		if(root.left == null && root.right == null) {
			if(total == sum) {
				flag = true;
				return;
			}
		}
		
		if(root.left != null) {
			traverse(root.left, sum, total);
		}
		
		if(root.right != null) {
			traverse(root.right, sum, total);
		}
		
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