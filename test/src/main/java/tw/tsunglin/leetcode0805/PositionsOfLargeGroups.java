package tw.tsunglin.leetcode0805;

import java.util.ArrayList;
import java.util.List;

public class PositionsOfLargeGroups {
	public static List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int i = 0;
        int N = S.length(); 
        for(int j=0; j<N; j++) {
        	if(j==N-1 || S.toCharArray()[j]!=S.toCharArray()[j+1]) {
        		if((j-i+1)>=3) {
        			List<Integer> temp = new ArrayList<Integer>();
        			temp.add(i);
        			temp.add(j);
        			ans.add(temp);
        		}
        		i=j+1;
        	}
        }
        return ans;
    }
	public static void main(String[] args) {
		List<List<Integer>> ans = PositionsOfLargeGroups.largeGroupPositions("abbcccccddddd");
		System.out.println(ans);
	}

}
