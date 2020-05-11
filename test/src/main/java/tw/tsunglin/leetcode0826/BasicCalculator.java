package tw.tsunglin.leetcode0826;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BasicCalculator {

	public  Double calculate(String s) {
	    String[] str = s.split("\\s+");
	    Queue<String> q = new LinkedList<String>();
	    q.addAll(Arrays.asList(str));
	    Stack<String> ops = new Stack<String>();
	    Stack<Double> vals = new Stack<Double>();
	    while (!q.isEmpty()) { // Read token, push if operator.
	        String token = q.poll();
	        if (token.equals("(")) {
	        } else if (token.equals("+")) {
	            ops.push(token);
	        } else if (token.equals("-")) {
	            ops.push(token);
	        } else if (token.equals("*")) {
	            ops.push(token);
	        } else if (token.equals("/")) {
	            ops.push(token);
	        } else if (token.equals("sqrt")) {
	            ops.push(token);
	        } else if (token.equals(")")) { // Pop, evaluate, and push result if token is ")".
	            // Replace the top exp with it' result.
	            double v = vals.pop();
	            String op = ops.pop();
	            if (op.equals("+")) {
	                v = vals.pop() + v;
	            } else if (op.equals("-")) {
	                v = vals.pop() - v;
	            } else if (op.equals("*")) {
	                v = vals.pop() * v;
	            } else if (op.equals("/")) {
	                v = vals.pop() / v;
	            } else if (op.equals("sqrt")) {
	                v = Math.sqrt(v);
	            }
	            vals.push(v);
	        } else {
	            // Token not operator or paren: push double value.
	            vals.push(Double.parseDouble(token));
	        }
	    }
	    return (vals.pop());
	}

	public static void main(String[] args) {
		BasicCalculator calculator = new BasicCalculator();
		Double ans = calculator.calculate("( ( 2 + 1 ) + 9 )");
		System.out.println(ans);
	}

}
