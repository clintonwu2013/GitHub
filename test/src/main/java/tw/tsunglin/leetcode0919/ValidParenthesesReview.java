package tw.tsunglin.leetcode0919;

import java.io.IOException;
import java.util.Stack;

public class ValidParenthesesReview {
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for(char c: s.toCharArray()) {
			if(c=='(' || c=='[' || c=='{') {
				stack.add(c);
			}
			Character tmp = null;
			if(c==')' || c==']' || c=='}') {
				tmp = stack.pop();
			}
			if(c==')' && !tmp.equals('(')) {
				return false;
			}
			if(c==']' && !tmp.equals('[')) {
				return false;
			}
			if(c=='}' && !tmp.equals('{')) {
				return false;
			}
			
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		boolean ans = ValidParenthesesReview.isValid("{[]}");
		System.out.println(ans);

	}
}
