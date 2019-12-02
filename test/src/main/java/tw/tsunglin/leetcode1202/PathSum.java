package tw.tsunglin.leetcode1202;

public class PathSum {
	public boolean hasPathSum(TreeNode root, int sum) {
		
		return DFS(root, 0, sum);
	}
	
	private boolean DFS(TreeNode root, int sumSoFar, int sum) {
		if(root == null) {
			return false;
		}
		sumSoFar = sumSoFar + root.val;
		
		 if (root.right == null && root.left == null) {
			 return sumSoFar == sum;
		 }
		
		return DFS(root.left, sumSoFar, sum) || 
				DFS(root.right, sumSoFar, sum);
		
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
