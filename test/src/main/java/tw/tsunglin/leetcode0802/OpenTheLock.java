package tw.tsunglin.leetcode0802;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class OpenTheLock {
	public int openLock(String[] deadends, String target) {
		Set<String> deads = new HashSet<String>(Arrays.asList(deadends));
        LinkedList<String> q = new LinkedList<String>();
        int steps=0;
        
        
        if(deads.contains(target)|| deads.contains("0000")) {
        	return -1;
        }
        
        deads.add("0000");
        q.add("0000");
        
        while(!q.isEmpty()) {
        	int length = q.size();
        	for(int i=0; i<length; i++) {
        		String current = q.poll();
        		if(current.equals(target)) {
        			return steps;
        		}
        		List<String> neighbors = neighbors(current);
        		
        		for(String neighbor: neighbors) {
        			if(!deads.contains(neighbor)) {
        				deads.add(neighbor);
        				q.add(neighbor);
        			}
        		}
        	}
        	steps++;
        }
		return -1;
        
    }
    
    public List<String> neighbors(String s){
        List<String> ans = new ArrayList<String>();
        char[] curr = s.toCharArray();
        for(int i = 0; i < 4; i++){
            if(curr[i] == '9'){
                char p = curr[i];
                curr[i] -= 1;
                ans.add(new String(curr));
                curr[i] = '0';
                ans.add(new String(curr));
                curr[i] = p;
            }
            else if(curr[i] == '0'){
                char p = curr[i];
                curr[i] += 1;
                ans.add(new String(curr));
                curr[i] = '9';
                ans.add(new String(curr));
                curr[i] = p;
            }
            else{
                char p = curr[i];
                curr[i] += 1;
                ans.add(new String(curr));
                curr[i] -= 2;
                ans.add(new String(curr));
                curr[i] = p;
            }
        }
        return ans;
    }

	public static void main(String[] args) {
		OpenTheLock OpenTheLock = new OpenTheLock();
		String[] deadends = {"0201","0101","0102","1212","2002"};
		String target = "0202";
		int ans = OpenTheLock.openLock(deadends, target);
		System.out.println(ans);
	}

}
