package tw.tsunglin.leetcode1014;

import java.util.ArrayList;
import java.util.List;

public class LexicalNumbers {
	private List<Integer> ans;
    private int N;
    public List<Integer> lexicalOrder(int n) {
    	this.ans = new ArrayList<Integer>();
        this.N = n;
        
        for(int i = 1; i<Math.min(n, 9); i++) {
        	dfs(i);
        }
        return ans;
    }
    
    private void dfs(int num) {
       ans.add(num);
       for(int i=0; i<=9; i++) {
    	   if(num*10 + i <= N) {
    		   dfs(num*10 + i);
    	   }
       }
    }


	public static void main(String[] args) {
		LexicalNumbers test = new LexicalNumbers();
		List<Integer> ans = test.lexicalOrder(13);
		
		System.out.println(ans);

	}

}
