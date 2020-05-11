package tw.tsunglin.leetcode1009;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
	
	List<String> ans = new ArrayList<String>();
	public List<String> binaryTreePaths(TreeNode root) {
		String str = "";
		buildTree(root ,str);
		return ans;
	}
	
	public void buildTree(TreeNode root, String str) {
		
		if(root == null) {
			return;
		}
		
		if(root.left == null && root.right == null) {
			str = str + root.val;
			ans.add(str.toString());
			str = "";
			return;
		}
		
		str = str + root.val + "->";
		
		buildTree(root.left ,str);
		buildTree(root.right ,str);
		
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
