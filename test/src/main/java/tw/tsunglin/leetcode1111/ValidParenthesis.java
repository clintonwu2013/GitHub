package tw.tsunglin.leetcode1111;

import java.util.Stack;

public class ValidParenthesis {
	public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        if(s.length()%2 != 0) {
        	return false;
        }
		for(char c : s.toCharArray()) {
			if(c != ')' && c != ']' && c!='}') {
				stack.add(c);
			}
			
			if( c == ')' ) {
				if(stack.isEmpty()) {
					return false;
				}
				char tmp = stack.pop();
				if(tmp != '(') {
					return false;
				}
			}
			
			if( c == ']') {
				if(stack.isEmpty()) {
					return false;
				}
				char tmp = stack.pop();
				if(tmp != '[') {
					return false;
				}
			}
			
			if( c == '}') {
				if(stack.isEmpty()) {
					return false;
				}
				char tmp = stack.pop();
				if(tmp != '{') {
					return false;
				}
			}
		}
		return true;
    }
	
	public static boolean isValid2(String s) {
		if(s.length() == 0) {
			return true;
		}
		if(s.length() == 1) {
			return false;
		}
		Stack<Character> stack = new Stack<Character>();
		for(char c: s.toCharArray()) {
			if( c==')' || c=='}' || c==']') {
				if(stack.size() >=1) {
					
					if( c==')' && stack.pop() =='(') {
						continue;
					}
					else if( c=='}' && stack.pop() =='{') {
						continue;
					}
					else if(c==']' && stack.pop() =='[') {
						continue;
					}
					else {
						return false;
					}
				}else {
					return false;
				}
			}else {
				stack.add(c);
			}
		}
		if(stack.size() == 0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		boolean ans = ValidParenthesis.isValid("()");
		System.out.println(ans);

	}

}
