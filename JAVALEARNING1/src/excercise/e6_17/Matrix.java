package excercise.e6_17;

import java.util.Scanner;

public class Matrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		printMatrix(n);
	}
	
	public static void printMatrix(int n ){
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				int a = (int) Math.round(Math.random());
				System.out.printf("%4d",a);
			}
			System.out.println();
		}
	}

}
