package tw.tsunglin.leetcode0813;

public class RemoveOuterMostParenthesis {
	public String removeOuterParentheses(String S) {
        if(S=="") {
        	return S;
        }
        StringBuilder resultBuilder = new StringBuilder();
        char[] arr = S.toCharArray();
        int count=0;
        int flag=1;
        for(int i=0; i<arr.length; i++) {
        	if(i==0 || count==0) {
        		flag=1;
        	}else {
        		flag=0;
        	}
        	
        	if(arr[i]=='(') {
        		count++;
        	}else {
        		count--;
        	}
        	
        	if(flag==0 && count!=0) {
        		resultBuilder.append(arr[i]);
        	}
        }
        return resultBuilder.toString();
    }

	public static void main(String[] args) {
		RemoveOuterMostParenthesis RemoveOuterMostParenthesis = 
				new RemoveOuterMostParenthesis();
		String ans = RemoveOuterMostParenthesis.removeOuterParentheses("(()())(())");
		System.out.println(ans);
	}

}
