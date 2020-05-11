package tw.tsunglin.leetcode0716;

public class PartitionOfNuumber {

	public int findNumberOfPartion(int num) {
		int ans = 0;
		for (int i = 1; i < num; i++) {
			ans = ans + findPartitionWithCondition(i, num-i);
		}
		return ans+1;
	}

	public int findPartitionWithCondition(int Condition, int rest) {
		int ans=0;
		for(int i=1; i<= Condition;i++) {
			if((rest-i)==0) {
				ans++;
			}else if((rest-i)<0){
				break;
			}else {
				ans = ans+findPartitionWithCondition(i,rest-i);
			}			
		}
		return ans;
	}

	
	
	public static void main(String[] args) {
		PartitionOfNuumber test = new PartitionOfNuumber();
		int ans = test.findNumberOfPartion(40);
		System.out.println(ans);
	}

}
