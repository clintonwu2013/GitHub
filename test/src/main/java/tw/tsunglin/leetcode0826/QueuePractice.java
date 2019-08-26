package tw.tsunglin.leetcode0826;

import java.util.Arrays;

public class QueuePractice<Type> {
	int front;
	int rear;
	int size;
	Type[] queue;
	
	@SuppressWarnings("unchecked")
	public QueuePractice(int size) {
		front = -1;
		rear = -1;
		this.size =size; 
		queue = (Type[])new Object[size];
	}
	public boolean isEmpty() {
		return (front==-1 && rear==-1);
	}
	public boolean isFull() {
		return (rear+1)%size == front;
	}
	
	
	public void push(Type value) {
		if(isFull()) {
			throw new IllegalStateException("queue is full");
		}else if(isEmpty()) {
			rear++;
			front++;
			queue[rear] = value;
		}else {
			rear = (rear+1)%size; //note!!!!!!
			queue[rear] = value;
		}
	}
	
	public Type pop() {
		if(isEmpty()) {
			throw new IllegalStateException("queue is empty");
		}else if(rear == front){
			Type record = queue[front]; 
			queue[front] = null;
			rear=-1;
			front=-1;
			return record;
		}else {
			Type record = queue[front]; 
			queue[front] = null;
			front = (front+1)%size;
			return record;
		}
		
		
	}
	@Override
    public String toString() {
        return "Queue [front=" + front + ", rear=" + rear + ", size=" + size
                + ", queue=" + Arrays.toString(queue) + "]";
    }
    
    
	public static void main(String[] args) {
        QueuePractice<Integer> newQueue = new QueuePractice<Integer>(10);
        newQueue.push(10);
        newQueue.push(20);
        newQueue.push(30);
        newQueue.push(40);
        newQueue.push(50);
        System.out.println(newQueue.toString());
        System.out.println(newQueue.pop().toString());
        System.out.println(newQueue.pop().toString());
        System.out.println(newQueue.toString());
        newQueue.push(60);
        newQueue.push(70);
        System.out.println( newQueue.toString());
        System.out.println( newQueue.pop().toString());
        System.out.println( newQueue.pop().toString());
        System.out.println( newQueue.pop().toString());
        System.out.println( newQueue.pop().toString());
        System.out.println( newQueue.pop().toString());
        System.out.println( newQueue.toString());
        
        System.out.println( newQueue.pop().toString());
    }
}
