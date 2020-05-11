package tw.tsunglin.leetcode0911;

public class BinaryTreeTilt {
	int tilt = 0;
    public int findTilt(TreeNode root) {
        traverse(root);
        return tilt;
    }
    public int traverse(TreeNode root){
        if(root == null) {
        	return 0;
        }
        int left = traverse(root.left);
        int right = traverse(root.right);
        
        tilt = tilt + Math.abs(left - right);
        return left + right + root.val;
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
