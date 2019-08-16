package tw.tsunglin.leetcode0814;

public class RemoveAllAdjacentDuplicates {
    public String removeDuplicates(String S) {
    	if(S.length()<2) {
    		return S;
    	}
    	
		char[] charArray = S.toCharArray();
		StringBuilder tempAns = new StringBuilder();
		if(charArray[0]!=charArray[1]) {
			tempAns.append(charArray[0]);
		}
		
    	for(int i=1; i<charArray.length-1;i++) {
			if(charArray[i]!=charArray[i+1] && charArray[i]!=charArray[i-1]) {
				tempAns.append(charArray[i]);
			}
		}
    	if(charArray[charArray.length-1]!= charArray[charArray.length-2]) {
			tempAns.append(charArray[charArray.length-1]);
		}
    	
    	if(S.equals(tempAns.toString())) {
    		return S;
    	}
    	
    	return removeDuplicates(tempAns.toString());        
    }
	public static void main(String[] args) {
		RemoveAllAdjacentDuplicates removeAllAdjacentDuplicates =new RemoveAllAdjacentDuplicates();
		String s = "abbaca";
		String ans = removeAllAdjacentDuplicates.removeDuplicates(s);
		
		System.out.println(ans);

	}

}
