package excercises.e3_3;

import java.util.Scanner;

public class Caipiao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int rightNum = (int) (Math.random() * 89) + 10;
		Scanner input = new Scanner(System.in);
		int myNum = input.nextInt();
		while (myNum != 0) {
			if ((myNum / 10 <= 10) && (myNum / 10 >=1)) {
				if (myNum == rightNum) {
					System.out.println("you're totally right, and get $10000");
				} else if (myNum != rightNum && (myNum / 10 == rightNum / 10)
						|| (myNum / 10 == rightNum % 10)
						|| (myNum % 10 == rightNum / 10)
						|| (myNum % 10 == rightNum % 10)) {
					System.out
							.println("you get only partly right ,and get $3000."
									+ "right num is :" + rightNum);
				} else {
					System.out
							.println("go play!" + "right num is :" + rightNum);
				}
				rightNum = (int) (Math.random() * 89) + 10;
				myNum = input.nextInt();
				
			} else {
				System.out.println("Are you kidding?Try again!");
				myNum = input.nextInt();
			}

		}
	}

}
