package tw.tsunglin.leetcode0729;


public class CircularQueue {
	
	private int size = 5;
	
	private Object[] queue;
	
	private int front;
	private int rear;
	
	public CircularQueue(){
		queue=new Object[this.size];
		this.front = -1;
		this.rear = -1;
	}
	
	public CircularQueue(int size){
		this.size = size;
		queue=new Object[this.size];
		this.front = -1;
		this.rear = -1;
	}
	
	
	
	public void enqueue(Object data) throws Exception{
		if((this.rear+1)% this.size == this.front) {
			System.out.println("Queue is full");
		}else if(this.front ==-1) {
			this.front=0;
			this.rear = 0;
			this.queue[this.rear] = data; 
		}else {
			this.rear = (this.rear + 1) % this.size;  
		    this.queue[this.rear] = data; 
		}
	}
	
	public Object dequeue() throws Exception{
		if(this.front ==-1) {
			System.out.println("Queue is empty");
		}else if(this.front == this.rear) {
			Object temp = this.queue[this.front];
			
			this.front = -1;
			this.rear = -1;
			
			return temp;
		}else {
			Object temp = this.queue[this.front];
			this.front = (this.front+1)% this.size;
			return temp;
		}
		return null;
			
	}
	
	public static void main(String[] args) throws Exception {
		
		CircularQueue queue = new CircularQueue();
		queue.enqueue("1");
		System.out.println(queue.dequeue());
		
		queue.enqueue("2");
		queue.enqueue("3");
		queue.enqueue("4");
		System.out.println(queue.dequeue());
		
		queue.enqueue("5");
		queue.enqueue("6");
		System.out.println(queue.dequeue());
		queue.enqueue("7");
		queue.enqueue("8");
		queue.enqueue("9");
		

	}

}
