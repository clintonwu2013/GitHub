package tw.tsunglin.leetcode0806;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {
	public static String mostCommonWord(String paragraph, String[] banned) {
		Set<String> banSet = new HashSet<String>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		initBanSet(banned, banSet);
		String ans = "";
		int ansFreq = 0;
		
		
		StringBuilder word = new StringBuilder();
		for (char c : paragraph.toCharArray()) {
			if (Character.isLetter(c)) {
				word.append(c);
			} else if (word.length() > 0) {
				String finalWord = word.toString();
				if (!banSet.contains(finalWord)) {					
					map.put(finalWord, map.getOrDefault(finalWord, 0) + 1);
					if (map.get(finalWord) > ansFreq) {
						ans = finalWord;
						ansFreq = map.get(finalWord);
					}
				}
				word = new StringBuilder();
			}
		}

		return ans;
	}

	private static void initBanSet(String[] banned, Set<String> banSet) {
		for (String word : banned) {
			banSet.add(word);
		}
	}

	public static void main(String[] args) {
		String[] banned = { "hhh" };
		String ans = MostCommonWord.mostCommonWord("hhhh, jjjjj jjjjj ooo", banned);
		System.out.println(ans);
	}

}
