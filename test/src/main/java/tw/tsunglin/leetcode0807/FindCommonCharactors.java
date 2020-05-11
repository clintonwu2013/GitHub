package tw.tsunglin.leetcode0807;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonCharactors {
	public List<String> commonChars(String[] A) {
		int[] count = new int[26];
		int[] ansTemp = new int[26];
		List<String> ans = new ArrayList<String>();
		Arrays.fill(ansTemp, 1000);
		
		for(String word: A) {
			Arrays.fill(count, 0);
			for(char c: word.toCharArray()) {
				count[c-'a']++;
			}
			for(int i=0;i<ansTemp.length;i++) {
				ansTemp[i] = Math.min(ansTemp[i], count[i]);
			}
			
		}
		for(int pos=0; pos<ansTemp.length; pos++) {
			while(ansTemp[pos]>0) {
				ans.add((char)(pos+'a') +"");
				ansTemp[pos]--;
			}
		}
		return ans;

	}

	public static void main(String[] args) {
		FindCommonCharactors findCommonCharactors = new FindCommonCharactors();
		List<String> ans = findCommonCharactors.commonChars(new String[] { "bella", "label", "roller" });
		System.out.println(ans);
	}
}
