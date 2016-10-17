package excercise.e5_7;

import java.util.Scanner;

public class Greatest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int gys = 0;
		Scanner input = new Scanner (System.in);
		int a1 = input.nextInt();
		int a2 = input.nextInt();
		for (int i = Math.min(a1, a2) ; i >1 ; i--) {
			if (a1%i ==0&&a2%i==0) {
				System.out.println("最大公约数是："+i);
				break;
			}
			
		}
	}

}
