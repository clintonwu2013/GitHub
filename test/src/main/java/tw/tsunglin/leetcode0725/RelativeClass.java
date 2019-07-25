package tw.tsunglin.leetcode0725;

public class RelativeClass {
	public String[] findRelativeRanks(int[] nums) {
		String[] result = new String[nums.length];
        int max=0;
        for(int i=0; i<nums.length; i++) {
        	if(nums[i]>max) {
        		max=nums[i];
        	}
        }
        
        int[] hash = new int[max+1];
        
        for(int i=0; i<nums.length; i++) {
        	hash[nums[i]]=i+1;
        }
        int place=1;
        for(int i=hash.length-1; i>=0; i--) {
        	if(hash[i]!=0) {
        		if(place==1) {
        			result[hash[i]-1]="gold";
        		}else if(place==2) {
        			result[hash[i]-1]="silver";
        		}else if(place==3) {
        			result[hash[i]-1]="bronze";
        		}else {
        			 result[hash[i]-1]=String.valueOf(place);
        		}
        		place++;
        	}
        	
        }
        return result;
    }
	public static void main(String[] args) {
		RelativeClass test = new RelativeClass();
		int[] nums = {4,5,3,2,1};
		String[] ans = test.findRelativeRanks(nums);
		
		for(int i=0; i<ans.length; i++) {
			System.out.println(ans[i]);
		}
		
	}
}
