package tw.tsunglin.leetcode0910;

public class BinarySearchTreeReview {
	public static  Node root;
	public BinarySearchTreeReview(){
		this.root = null;
	}
	
	public boolean find(int key) {
		Node current = root;
		while(current != null) {
			if(current.data == key) {
				return true;
			}else if(current.data > key){
				current = current.left;
			}else if(current.data < key){
				current = current.right;
			}
		}
		return false;
		
	}
	public void insert(int id){
		Node newNode = new Node(id);
		if(root == null) {
			root = newNode;
			return;
		}
		Node parent = null;
		Node current = root;
		while(true) {
			if(id < current.data) {
				parent = current;
				current = current.left;
				if(current == null) {
					parent.left = newNode;
					return;
				}
			}else {
				parent = current;
				current = current.right;
				if(current == null) {
					parent.right = newNode;
					return;
				}
			}
		}
		
		
	}
	
	public boolean delete(int id){
		
		if(root == null) {
			return false;
		}
		
		Node parent = root;
		Node current = root;
		boolean isLeftChild = false;
		
		while( current.data != id) {
			parent = current;
			if(id < current.data) {
				isLeftChild = true;
				current = current.left;
			}else{
				isLeftChild = false;
				current = current.right;
			}
			if(current ==null){
				return false;
			}
		}
		
		if(current.left == null && current.right == null) {
			if(current == root) {
				root = null;
			}
			if(isLeftChild) {
				parent.left = null;
			}else {
				parent.right = null;
			}
			
			return true;
		}
		else if(current.right==null){
			if(current == root) {
				root = current.left;
			}else if (isLeftChild) {
				parent.left = current.left;
			}else {
				parent.right = current.left;
			}
		}
		else if(current.left==null){
			if(current == root) {
				root = current.right;
			}else if (isLeftChild) {
				parent.left = current.right;
			}else {
				parent.right = current.right;
			}
		}
		else if(current.left!=null && current.right!=null){
			Node successor = getSuccessor(current);
			if(current == root) {
				root = successor;
			}else if(isLeftChild) {
				parent.left = successor;
			}else {
				parent.right = successor;
			}
			successor.left = current.left;
		}
		
		
		return true;
	}
	
	public Node getSuccessor(Node deleleNode){
		Node successor =null;
		Node successsorParent =null;
		Node current = deleleNode.right;
		while(current != null) {
			successor = current;
			successsorParent = successor;
			successor = current.left;
		}
		if(successor!=deleleNode.right){
			successsorParent.left = successor.right;
			successor.right = deleleNode.right;
		}
		return successor;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
