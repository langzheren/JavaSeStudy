package excercises.e3_4;

import java.util.Scanner;

public class TestMonkey1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String[] arr = {"monkey","rooster","dog","pig","rat","ox","tiger","rabbit","dragon","snake","horse","sheep"};
		Scanner input = new Scanner (System.in);
		int y = input.nextInt();
		int a = y%12;
		System.out.println(arr[a]);
	}

}
