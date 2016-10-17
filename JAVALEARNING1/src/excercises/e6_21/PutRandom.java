package excercises.e6_21;

import java.util.Scanner;

public class PutRandom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		for (int i = 0; i < 100; i++) {
			int num1 = (int) (Math.random()*10);
			int num2 = (int) (Math.random()*10);
			
			System.out.println(num1+""+num2);
		}
	}

}
