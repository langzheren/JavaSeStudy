package excercise.e6_6;

import java.util.Scanner;

public class CountPatten {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		displayPattern(n);
	}

	public static void displayPattern(int n){
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <= n-i; j++) {
			System.out.print("     ");
			}
			for (int j = i; j > 0; j--) {
				System.out.printf("%4d",j);
			}
			System.out.println();
		}
		
	}
}
