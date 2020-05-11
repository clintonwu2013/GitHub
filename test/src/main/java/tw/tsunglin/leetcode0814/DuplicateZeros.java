package tw.tsunglin.leetcode0814;

import java.util.Arrays;
import java.util.List;

public class DuplicateZeros {
    public static void duplicateZeros(Integer[] arr) {
        for(int i=0; i<arr.length-1; i++) {
        	if(arr[i]==0) {
        		Integer temp = arr[i+1];
  
        		for(int j=i+1;j<arr.length-1; j++) {
        			Integer temp2 = arr[j+1];
        			arr[j+1]=temp;
        			temp=temp2;
        			
        		}
        		arr[i+1]=0;	
        		i=i+1;
        	}
        }
    }
	public static void main(String[] args) {
		Integer[] arr = {1,0,2,3,0,4,5,0};
		DuplicateZeros.duplicateZeros(arr);
		List<Integer> ans = Arrays.asList(arr);
		System.out.println(ans);

	}

}
