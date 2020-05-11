package tw.tsunglin.leetcode0816;

public class LicenseKeyFormatting {
	public String licenseKeyFormatting(String S, int K) {
		int countLength=0;
		
		String[] temp = S.split("-");
		StringBuilder ans = new StringBuilder();
		for(int i=0; i<temp.length-1; i++) {
			if(temp[i].length() == K) {
				ans.append(temp[i].toUpperCase()+"-");
				countLength =0;
				i++;
			}
			
			if(temp[i].length()<K && i==0) {
				ans.append(K);
				ans.append("-");
			}
			while(countLength<K && i!=0) {				
				countLength = countLength+temp[i].length();
				if(countLength>=K) {
					countLength=0;
					ans.append(temp[i].toUpperCase());
					ans.append("-");
					break;
				}
				ans.append(temp[i].toUpperCase());
				i++;
			}
		}
		return ans.toString().substring(0,ans.length()-1);
	}

	public static void main(String[] args) {
		LicenseKeyFormatting licenseKeyFormatting = new LicenseKeyFormatting();
		String ans = licenseKeyFormatting.licenseKeyFormatting("2-5g-3-J", 2);
		System.out.println(ans);
		
	}

}
