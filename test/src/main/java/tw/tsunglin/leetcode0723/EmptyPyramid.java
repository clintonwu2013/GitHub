package tw.tsunglin.leetcode0723;

import java.util.Scanner;

public class EmptyPyramid {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("输入打印的行数：");
		int row = input.nextInt();
		for(int i=0;i<row-1;i++) {
			for(int j=0;j<row-i-1;j++) {
				System.out.print(" ");	
			}//输出空格
		
			System.out.print("*");//输出*
		
			for(int k=0;k<i*2-1;k++) {
				System.out.print(" ");
			}//输出空格
		
			if(i>0) {
				System.out.print("*");
			}//输出*
		
			System.out.println();//输出换行
		}
	
		for(int i=0;i<row*2-1;i++) {
			System.out.print("*");
		}		
	}

	}


