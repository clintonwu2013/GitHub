package tw.tsunglin.leetcode1009;

import java.util.Stack;

public class ReverseVowelsOfString {
	
	
	public static String reverseVowels(String s) {
		
		char[] charArray = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for(char c: charArray) {
			if(c == 'a' || c == 'e' || c == 'i'|| c == 'o'||c == 'u') {
				stack.add(c);
			}
		}
		for(int i=0; i< charArray.length; i++) {
			if(charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i'|| charArray[i] == 'o'|| charArray[i] == 'u') {
				charArray[i] = stack.pop();
			}
		}
		
		String ans = "" ;
		for(char c: charArray) {
			ans = ans + c; 
		}
		return ans;
	}

	public static void main(String[] args) {
		String ans = ReverseVowelsOfString.reverseVowels("hello");
		
		System.out.println(ans);
		

	}

}
