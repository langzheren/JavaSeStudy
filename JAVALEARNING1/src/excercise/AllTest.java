package excercise;

import java.util.Scanner;

import excercise.e7_1.ArrayTest;
import excercise.e7_1.CountLettersInArray;
import excercise.e7_1.TestArrayCopy;

public class AllTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("要使用的功能：");
		System.out.println("1、随机抽扑克牌 2、实验system.arraycopy  3、计算随机字母中各字母出现的次数" );
		int a = input.nextInt();
		switch (a){
		case 1:
			System.out.println("输入抽取第几张扑克牌");
			a=input.nextInt();
			ArrayTest.Deck(a);break;
		case 2:
			TestArrayCopy.copyArray();break;
		case 3:
			CountLettersInArray.count();
		}
	}

}
