package excercise.e1;

import java.util.Scanner;

public class Count1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		String[] arr = {"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
		int q = 0;
		int m = 0;
		int y = 0;
		int k = 0;
		int j = 0;
		int h = 0;
		int b = input.nextInt();
		switch(b){
		case 1 :
				{
				System.out.println("输入年份：");
				y = input.nextInt();
				System.out.println("输入月份：");
				m = input.nextInt();
				System.out.println("输入日期：");
				q = input.nextInt();
				if (m == 1 ) {
					m = 14;
					y -= 1;
					j = Math.abs(y/100);
					k = y%100;
					h =( q -1 +( 26 * (m+1))/10 + k + k/4 + j/4 + 5* j )%7;
				}else if(m == 2){
					m = 14;
					y -= 1;
					j = Math.abs(y/100);
					k = y%100;
					h =( q - 1   +( 26 * (m+1))/10 + k + k/4 + j/4 + 5* j )%7;
				}else{
					j = Math.abs(y/100);
					k = y%100;
					h =( q - 1   +( 26 * (m+1))/10 + k + k/4 + j/4 + 5* j )%7;
				}
				
				System.out.println("输入的值是：" + arr[h]);	
				}break;
		//求月份对应的第一天是星期几
		case 2:
				{
				System.out.println("输入年份");
				y = input.nextInt();
				for (int i = 1; i < 13; i++) {
					
				}
				
				}
		}
		
	}

}
