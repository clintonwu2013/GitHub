package tw.tsunglin.leetcode1210;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		bfs(root, res);

		return res;
	}

	private void bfs(TreeNode root, List<List<Integer>> res) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if(root != null) {
			queue.offer(root);
		}
		
		while(!queue.isEmpty()) {
			int size = queue.size();
			List<Integer> list = new ArrayList<Integer>();
			
			for(int i=0; i< size; i++) {
				TreeNode curr = queue.poll();
				list.add(curr.val);
				
				if(curr.left != null) {
					queue.add(curr.left);
				}
				
				if(curr.right != null) {
					queue.add(curr.right);
				}
			}
			res.add(0, list);
			
		}
	}
}
