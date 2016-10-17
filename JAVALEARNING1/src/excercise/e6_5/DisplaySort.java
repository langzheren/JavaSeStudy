package excercise.e6_5;

import java.util.Scanner;

public class DisplaySort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		int a1 = input.nextInt();
		int a2 = input.nextInt();
		int a3 = input.nextInt();
		displaySorted(a1,a2,a3);
				
	}
	
	public static void displaySorted(double num1,double num2,double num3){
		if (num1 > num2) {
			double temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if (num2 > num3) {
			double temp = num2;
			num2 = num3;
			num3 = temp;
		}
		if (num1 > num2) {
			double temp = num1;
			num1 = num2;
			num2 = temp;
		}
		System.out.println(num1+" "+num2+" "+num3);
	}
	
}
