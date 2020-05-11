package tw.tsunglin.leetcode0916;

public class QueuReview {
	private int front;
	private int rear;
	private int[] queue;
	private int size;
	public QueuReview(int size) {
		front = -1;
		rear = -1;
		this.size = size;
		queue = new int[size];
	}
	public boolean isEmpty() {
		if(front == -1 && rear == -1) {
			return true;
		}
		return false;
	}
	
	
	public void push(int value) {
		if((rear+1)%size == front) {
			throw new IllegalStateException("Queue is full");
		}
		else if(isEmpty()) {
			front++;
			rear++;
			queue[front] = value;
		}else {
			rear = (rear+1)%size;
			queue[rear] = value;
			
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new IllegalStateException("Queue is empty!");
		}
		//front == rear代表只剩一個元素
		else if(front == rear){
			int value = queue[front];
			front = -1;
			rear = -1;
			return value;
		}else {
			front = (front + 1)%size;
			return queue[front];
		}
		
	}
	
	public static void main(String[] args) {
		

	}

}
