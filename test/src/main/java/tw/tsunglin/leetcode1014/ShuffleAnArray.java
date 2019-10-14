package tw.tsunglin.leetcode1014;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShuffleAnArray {

	int[] nums = null;
	int[] original = null;

	private Random rand = new Random();

	private List<Integer> getArrayCopy() {
		List<Integer> asList = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			asList.add(nums[i]);
		}
		return asList;
	}

	public ShuffleAnArray(int[] nums) {
		this.nums = nums;
		this.original = nums.clone();
	}

	public int[] Reset() {
		this.nums = original;
		this.original = original.clone();
		return nums;

	}

	public int[] shuffle() {
        List<Integer> aux = getArrayCopy();

        for (int i = 0; i < nums.length; i++) {
            int removeIdx = rand.nextInt(aux.size());
            nums[i] = aux.get(removeIdx);
            aux.remove(removeIdx);
        }

        return nums;
    }
	
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
