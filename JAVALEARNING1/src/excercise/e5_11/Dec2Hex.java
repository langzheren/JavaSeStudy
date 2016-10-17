package excercise.e5_11;

import java.util.Scanner;

public class Dec2Hex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input =new Scanner(System.in);
		System.out.print("Enter a decimal number:");
		int decimal = input.nextInt();
		String Hex = "";
		while(decimal !=0){
			int hexValue = decimal %16;
			char hexDigit = (hexValue <=9 && hexValue>= 0)?(char)(hexValue + '0'):(char)(hexValue-10+'A');
			Hex = hexDigit + Hex;
			decimal = decimal /16;
			
		}
		System.out.println("The hex number is "+Hex);
	}

}
