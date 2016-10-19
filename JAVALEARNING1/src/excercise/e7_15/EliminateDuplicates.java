package excercise.e7_15;

import java.util.Arrays;
import java.util.Scanner;

public class EliminateDuplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("enter 10 numbers , and will eliminate the Redundant ");
		Scanner input = new Scanner(System.in);
		int[] arr = new int[10];
		int[] count = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = input.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}

		for (int i = 0; i < count.length; i++) {
			if (count[i]!=0) {
				System.out.print(i+"  ");
				
			}
		}
	}

}
