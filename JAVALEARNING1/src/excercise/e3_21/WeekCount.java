package excercise.e3_21;

import java.util.Scanner;

public class WeekCount {

	/**
	 * 计算某日期是星期几
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("选择开启的功能：1、输入年月日，得出对应星期几。2、输入年份，得出当年每月的一号对应星期几。3、输入年份，显示每个月的日历。");
		String[] arr = {  "星期日", "星期一", "星期二", "星期三", "星期四", "星期五","星期六" };
		int a = input.nextInt();
		switch (a) {
		case 1: {
			int h, q, m, y, k, j = 0;
			System.out.print("输入年：");
			y = input.nextInt();
			System.out.print("输入月：");
			m = input.nextInt();
			System.out.print("输入日：");
			q = input.nextInt();
			if (m == 1) {
				m = 13;
				y -= 1;
			}
			if (m == 2) {
				m = 14;
				y -= 1;
			}
			j = y / 100;
			k = y % 100;
			h = (q-1 + (26 * (m + 1) / 10) + k + k / 4 + j / 4 + 5 * j) % 7;
			System.out.println("今天是：" + arr[h]);
		}
			break;
		case 2: {
			int h, y, k, j = 0;
			System.out.print("输入年：");
			y = input.nextInt();

			
			for (int m1 = 1; m1 < 13; m1++) {
				if (m1 == 1) {
					m1 = 13;
					y -= 1;
					j = y / 100;
					k = y % 100;
					h = ( (26 * (m1 + 1) / 10) + k + k / 4 + j / 4 + 5 * j) % 7;
					System.out.println(y + 1 + "年" + 1 + "月的第一天是：" + arr[h]);
					m1 = 1;
					y += 1;
				} else if (m1 == 2) {
					m1 = 14;
					y -= 1;
					j = y / 100;
					k = y % 100;
					h = ( (26 * (m1 + 1) / 10) + k + k / 4 + j / 4 + 5 * j) % 7;
					System.out.println(y + 1 + "年" + 2 + "月的第一天是：" + arr[h]);
					m1 = 2;
					y += 1;
				} else {
					j = y / 100;
					k = y % 100;
					h = ( (26 * (m1 + 1) / 10) + k + k / 4 + j / 4 + 5 * j) % 7;
					System.out.println(y + 1 + "年" + m1 + "月的第一天是：" + arr[h]);
				}

			}
		}
			break;
		case 3: {
			int h, y, k, j = 0;
			System.out.print("输入年：");
			y = input.nextInt();
			
			for (int m1 = 1; m1 < 13; m1++) {
				if (m1 == 1) {
					m1 = 13;
					y -= 1;
					j = y / 100;
					k = y % 100;
					h = ( (26 * (m1 + 1) / 10) + k + k / 4 + j / 4 + 5 * j) % 7;
					m1 = 1;
					y += 1;
					System.out.println(h);
					System.out.println("\t\t\t\t"+y+"\t一月份");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("星期日   星期一   星期二   星期三   星期四   星期五   星期六");
					for (int l = 0; l < h; l++) {
						System.out.printf("\t          ");
					}
					for (int i = 1; i < 32; i++) {
						
						System.out.printf("%8d   ",i);
						if ((i+h)%7==0) {
							System.out.println();
						}
						
					}
					System.out.println();
				} else if (m1 == 2) {
					m1 = 14;
					y -= 1;
					j = y / 100;
					k = y % 100;
					h = (1 + (26 * (m1 + 1) / 10) + k + k / 4 + j / 4 + 5 * j) % 7;
					m1 = 2;
					y += 1;
				} else {
					j = y / 100;
					k = y % 100;
					h = (1 + (26 * (m1 + 1) / 10) + k + k / 4 + j / 4 + 5 * j) % 7;
				}

			}
		}
			break;

		}

	}

}
