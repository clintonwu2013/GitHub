package tw.tsunglin.leetcode0802;

public class ShortestCompletingWord {
	public String shortestCompletingWord(String licensePlate, String[] words) {
        char[] pattern = licensePlate.toLowerCase().toCharArray();
        int[] count = new int[26];
        
        for(char letter: pattern) {
        	
        	if(letter<='z' && letter>='a') {
        		count[letter-'a']++;	
        	}
        	
        }
        String ans = "";
        int minLength=Integer.MAX_VALUE;
        for(String word: words) {
        	if(isComleting(word, count) && word.length()< minLength) {
        		minLength = word.length();
        		ans=word;
        	}
        }
		return ans;
        
    }
    
    private boolean isComleting(String s, int[] count){
    	char[] pattern2 = s.toLowerCase().toCharArray();
        int[] count2 = new int[26];
        
        for(char letter: pattern2) {
        	if(letter<='z' && letter>='a') {
        		count2[letter-'a']++;
        	}
        }
        for(int i=0; i<count.length; i++) {
        	if(count[i]>count2[i]) {
        		return false;
        	}
        }
        return true;
    }

	public static void main(String[] args) {
		ShortestCompletingWord ShortestCompletingWord = new ShortestCompletingWord();
		String licensePlate = "1s3 PSt";
		String[] words = {"step", "steps", "stripe", "stepple"}; 
		String ans = ShortestCompletingWord.shortestCompletingWord(licensePlate, words);
		System.out.println(ans);
	}

}
