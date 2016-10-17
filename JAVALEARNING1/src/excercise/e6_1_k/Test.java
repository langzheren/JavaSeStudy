package excercise.e6_1_k;

import java.util.Scanner;

public class Test {

	/**
	 * 计算给定区域的数据和
	 * @param args
	 * @author yangfm
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("输入要计算的数据区间：");
		int start = input.nextInt();
		int end = input.nextInt();
		sum(start,end);
		
	}
	
	public static void sum(int start,int end){
		int b = 0;
		for (int i = start; i <= end; i++) {
			b += i;
		}

		System.out.println("给定区域的数据和为："+b);
	}

}
