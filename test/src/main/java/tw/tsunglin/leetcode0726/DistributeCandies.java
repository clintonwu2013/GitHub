package tw.tsunglin.leetcode0726;

import java.util.Arrays;

public class DistributeCandies {
    public static int distributeCandies(int[] candies) {
    	int places = candies.length/2;
    	int kindsOfCandies = 1;
    	Arrays.sort(candies);
    	for(int i=1; i<candies.length; i++) {
    		if(candies[0] != candies[i] && candies[i]!=candies[i-1]) {
    			kindsOfCandies++;
    		}
    	}
    	
    	if(kindsOfCandies>=places) {
    		return places;
    	}else {
    		return kindsOfCandies;
    	}
		
    }
	public static void main(String[] args) {
		int[] candies = {1,2,2,2,2,2,7,7,7,7};
		int ans = DistributeCandies.distributeCandies(candies);
		System.out.println(ans);
	}

}
