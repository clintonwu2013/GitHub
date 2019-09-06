package tw.tsunglin.leetcode0905;

public class ReverseStringII {
    public String reverseStr(String s, int k) {
    	
    	int front = 0;
    	int end = 0;
    	
    	StringBuilder ans = new StringBuilder();
    	
    	for(int i=0; i<(int)(s.length()/k); i=i+1) {
    		if(i%2==0) {
    			front = i*k;
        		end = (i+1)*k;
        		String tmp = s.substring(front, end);
        		tmp = reverse(tmp);
        		ans.append(tmp);
        		
    		}else {
    			front = i*k;
        		end = (i+1)*k;
    			String tmp = s.substring(front, end);
    			ans.append(tmp);
    		}
    		
    	}
    	String tmp = s.substring(end, s.length());
    	tmp = reverse(tmp);
    	ans.append(tmp);
    	
		return ans.toString();  
    }
    
    public String reverse(String str) {
        char[] c = str.toCharArray();
        int j = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            c[j++] = str.charAt(i);
        }
        return String.valueOf(c);
    }
	public static void main(String[] args) {
		ReverseStringII test = new ReverseStringII();
		String ans = test.reverseStr("abcdefgh", 3);
		System.out.println(ans);

	}

}
