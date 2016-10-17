package excercise.e5_1;

import java.util.Scanner;

public class SentinelValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input  = new Scanner(System.in);
		System.out.println("enter input");
		int data = input.nextInt();
		int sum = 0;
		while (data!=0){
			sum += data;
			System.out.println("enter input");
			data = input.nextInt();
			
		}
		System.out.println(sum);
		
	}

}
