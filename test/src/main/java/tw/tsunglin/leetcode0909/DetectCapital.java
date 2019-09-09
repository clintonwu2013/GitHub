package tw.tsunglin.leetcode0909;

public class DetectCapital {
    public static boolean detectCapitalUse(String word) {
    	
    	char[] charWords = word.toCharArray();
    	char firstWord = charWords[0];
    	char secondWord = charWords[1];
    	boolean ans = true;
    	String type;
    	if(firstWord <= 'Z' && firstWord >='A' && secondWord<= 'Z' && secondWord >='A') {
    		for(int i=2; i<charWords.length; i++) {
    			if(charWords[i] <= 'z' && charWords[i] >= 'z') {
    				ans = false;
    				break;
    			}
    		}
    	}else if(firstWord <= 'Z' && firstWord >='A' && secondWord<= 'z' && secondWord >='a') {
    		for(int i=2; i<charWords.length; i++) {
    			if(charWords[i] <= 'Z' && charWords[i] >= 'A') {
    				ans = false;
    				break;
    			}
    		}
    	}
    	else {
    		for(int i=1; i<charWords.length; i++) {
    			if(charWords[i] <= 'Z' && charWords[i] >= 'A') {
    				ans = false;
    				break;
    			}
    		}
    	}
		return ans;
    }
	public static void main(String[] args) {
		boolean ans = detectCapitalUse("aassLkk");
		System.out.println(ans);

	}

}
