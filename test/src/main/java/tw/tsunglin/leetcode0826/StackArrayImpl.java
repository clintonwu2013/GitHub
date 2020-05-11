package tw.tsunglin.leetcode0826;

import java.util.Arrays;

public class StackArrayImpl<Type> {
	int size = 2;
	Type[] stack;
	int currPosition;
	@SuppressWarnings("unchecked")
	public StackArrayImpl(){
		
		currPosition = -1;
		stack = (Type[])new Object[size];
	}
	public boolean isFull() {
		return currPosition==(size-1);
	}
	public boolean isEmpty() {
		return currPosition==-1;
	}
	
	
	public void push(Type val) {
		if(isFull()) {
			ensureCapacity();
		}
		stack[++currPosition] = val;
	}
	
	
	public Type pop() {
		if(isEmpty()) {
			throw new IllegalStateException("stack is empty!!");
		}
		Type record = stack[currPosition];
		stack[currPosition] = null;
		currPosition--;
		return record;
	}
	
	private void ensureCapacity() {
        size = stack.length * 2;
        stack = Arrays.copyOf(stack, size);
        
    }
	public static void main(String[] args) {
		StackArrayImpl<Integer> stack = new StackArrayImpl<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
	
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}

}
