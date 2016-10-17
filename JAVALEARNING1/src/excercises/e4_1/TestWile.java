package excercises.e4_1;

import java.util.Scanner;

public class TestWile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int rdmNum1 = (int) (Math.random() * 10);
		int rdmNum2 = (int) (Math.random() * 10);
		System.out.println("what is "+rdmNum1 +" + "+ rdmNum2+" ?");
		Scanner input = new Scanner (System.in);
		int num1 = input.nextInt();

		
		
		while((num1)!=(rdmNum1+rdmNum2)){
			System.out.println("wrong!try again:");
			num1 = input.nextInt();
		}
		System.out.println("you got it!");
	}

}
