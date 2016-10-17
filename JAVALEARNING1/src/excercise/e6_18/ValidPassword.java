package excercise.e6_18;

import java.util.Scanner;

public class ValidPassword {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String a = input.nextLine();
		validPassword(a);
		System.out.println("已经判断完毕。");
	}

	public static void validPassword(String validw){
		if (validw.length()<8) {
			System.out.println("密码必须至少是8位！");
			return;
		}
		
		char[] arr  = validw.toCharArray();
		
		for (int j = 0; j <= validw.length(); j++) {
			if (arr[j]<'0'||arr[j]>'Z') {
				System.out.println("密码仅能包括字母和数字");
				return;
			}
			
		}
		for (int i = 1; i <= validw.length(); i++) {
			
		}
	}
}
