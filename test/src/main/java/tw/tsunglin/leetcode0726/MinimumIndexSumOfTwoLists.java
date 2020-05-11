package tw.tsunglin.leetcode0726;

public class MinimumIndexSumOfTwoLists {
	public static String[] findRestaurant(String[] list1, String[] list2) {
		int sum=list1.length+list2.length;
		String[] ans = new String[1];
		for(int i=0; i<list1.length; i++) {
			for(int j=0; j<list2.length; j++) {
				if(list1[i].equals(list2[j]) && sum-i-j>0) {
					sum=i+j;
					ans[0]=list1[i];
				}
			}
		}
		return ans;

	}

	public static void main(String[] args) {
		String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
		String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
		String[] ans = MinimumIndexSumOfTwoLists.findRestaurant(list1, list2);
		System.out.println(ans[0]);
	}

}
