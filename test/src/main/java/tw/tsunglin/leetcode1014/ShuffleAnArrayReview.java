package tw.tsunglin.leetcode1014;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShuffleAnArrayReview {
	private int[] nums;
	private int[] original;
	Random rand = new Random();
	
//	public List<Integer> getCopyArray(){
//		List<Integer> asList = new ArrayList<Integer>();
//		for(int num: nums) {
//			asList.add(num);
//		}
//		return asList;
//	}
//	
//	
//	public ShuffleAnArrayReview(int[] nums) {
//		this.nums = nums;
//		this.original = nums.clone();
//	}
//
//	public int[] Reset() {
//		this.nums = original;
//		this.original = original.clone();
//		return nums;
//	}
//	
//
//	public int[] shuffle() {
//       List<Integer> aux = getCopyArray();
//       
//       for(int i =0 ; i<nums.length; i++) {
//    	   int randomNumber = rand.nextInt(aux.size());
//    	   nums[i] = aux.get(randomNumber);
//    	   aux.remove(randomNumber);
//       }
//       
//       return nums;
//    }
	
	
	
	private int randRange(int min, int max) {
        return rand.nextInt(max - min) + min;
    }

    private void swapAt(int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int[] fisherYatesShuffle() {
        for (int i = 0; i < nums.length; i++) {
            swapAt(i, randRange(i, nums.length));
        }
        return nums;
    }

	public static void main(String[] args) {
		ShuffleAnArray test = new ShuffleAnArray(new int[] {1,2,3,4,5});
		int[] ans = test.shuffle();
		
		for(int a: ans) {
			System.out.println(a);
		}

	}

}
