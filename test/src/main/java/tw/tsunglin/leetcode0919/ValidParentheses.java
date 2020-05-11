package tw.tsunglin.leetcode0919;

import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> valid = new Stack<Character>();
        char temp;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == '(' || arr[i] == '{' || arr[i] == '['){
                valid.push(arr[i]);
            }
            
            else if(arr[i] == ')' || arr[i] == '}' || arr[i] == ']'){
                if(valid.empty()==false){
                    temp = (char)valid.pop();
                }else{
                    return false;
                }
                
                if(temp == '(' && arr[i] == ')'){
                    continue;
                }
                else if(temp == '{' && arr[i] == '}'){
                    continue;
                }
                else if(temp == '[' && arr[i] == ']'){
                    continue;
                }else{
                    return false;
                }
            }//end else if
        }//end for
       
        //if the stack is not empty,  then false
        if(valid.empty()==false){
            return false;
        }
        
        return true;
    }//end method

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
