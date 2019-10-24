package tw.tsunglin.leetcode1015;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthOfBinaryTree {
	public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<UsedNode> queue = new LinkedList<UsedNode>();
        queue.offer(new UsedNode(root, 1));
        int curW = 0;
        int maxW = 0;
        while (!queue.isEmpty()) {
            int start = 0;
            int end = 0;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                UsedNode cur = queue.poll();
                TreeNode node = cur.node;
                if (i == 0) {
                    start = cur.pos;
                }
                if (i == size - 1) {
                    end = cur.pos;
                }
                if (node.left != null) {
                    queue.offer(new UsedNode(node.left, cur.pos * 2));
                }
                if (node.right != null) {
                    queue.offer(new UsedNode(node.right, cur.pos * 2 + 1));
                }
                curW = end - start + 1;
                maxW = Math.max(maxW, curW);
            }
        }
        return maxW;
    }
	
	public int widthOfBinaryTreeReview(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<UsedNode> queue = new LinkedList<UsedNode>();
        UsedNode firstNode = new UsedNode(root,1);
        queue.offer(firstNode);
        
        int currWidth = 0;
        int maxWidth = 0;
        
        while(!queue.isEmpty()) {
        	for(int i =0 ; i<queue.size(); i++) {
        		UsedNode usedNode = queue.poll();
        		int start = 0;
        		int end = 0;
        		
        		if(i == 0) {
        			end = usedNode.pos;
        		}
        		
        		if(i == queue.size()-1) {
        			start = usedNode.pos;
        		}
        		
        		if(usedNode.node.left != null) {
        			queue.offer(new UsedNode(usedNode.node.left,usedNode.pos*2 ));
        		}
        		if(usedNode.node.right != null) {
        			queue.offer(new UsedNode(usedNode.node.right,usedNode.pos*2 +1 ));
        		}
        		
        		
        		currWidth = end - start +1;
        		maxWidth = Math.max(maxWidth, currWidth);
        	}
        }
        
		return maxWidth;
        
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

class UsedNode {
    int pos;
    TreeNode node;
    UsedNode(TreeNode node, int pos) {
        this.node = node;
        this.pos = pos;
    }
}
