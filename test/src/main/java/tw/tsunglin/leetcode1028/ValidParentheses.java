package tw.tsunglin.leetcode1028;

import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for(char c : s.toCharArray()) {
			if(c != ')' || c != ']' || c=='}') {
				stack.add(c);
			}
			
			if( c == ')') {
				char tmp = stack.pop();
				if(tmp != '(') {
					return false;
				}
			}
			
			if( c == ']') {
				char tmp = stack.pop();
				if(tmp != '[') {
					return false;
				}
			}
			
			if( c == '}') {
				char tmp = stack.pop();
				if(tmp != '{') {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
