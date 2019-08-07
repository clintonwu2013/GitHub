package tw.tsunglin.leetcode0807;

import java.util.ArrayList;
import java.util.List;

public class LongPressedName {
	
	public boolean isLongPressedName(String name, String typed) {
        Group g1 = groupify(name);
        Group g2 = groupify(typed);
        if(!g1.key.equals(g2.key)) {
        	return false;
        }
        for(int i=0; i<g1.count.size();i++) {
        	if(g1.count.get(i)>g2.count.get(i)) {
        		return false;
        	}
        }
        return true;
    }

    public Group groupify(String S) {
        StringBuilder key = new StringBuilder();
        List<Integer> count = new ArrayList<Integer>();
        
        int length = S.length();
        int anchor = 0;
        for(int i=0; i<S.length(); i++) {
        	if(i== length-1 || S.charAt(i)!= S.charAt(i+1)) {
        		key.append(S.charAt(i));
        		count.add(i-anchor+1);
        		anchor= i+1;
        	}
        }
        return new Group(key.toString(), count);
    }
	public static void main(String[] args) {
		LongPressedName longPressedName = new LongPressedName();
		String name = "aleex";
		String typed = "aallexx";
		boolean ans = longPressedName.isLongPressedName(name, typed);
		
		System.out.println(ans);
		

	}

}
class Group {
    String key;
    List<Integer> count;
    Group(String k, List<Integer> c) {
        key = k;
        count = c;
    }
}
