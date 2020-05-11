package tw.tsunglin.leetcode0726;



public class StudentAtendanceRecord {
	public boolean checkRecord(String s) {
		int absent=0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='A') {
				absent++;
				if(absent==2) {
					return false;
				}
			}
			
			if(i<=s.length()-3 && s.substring(i,i+3).equals("LLL")) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		StudentAtendanceRecord studentAtendanceRecord = new StudentAtendanceRecord();
		boolean ans = studentAtendanceRecord.checkRecord("PPALLP");
		System.out.println(ans);
	}

}
