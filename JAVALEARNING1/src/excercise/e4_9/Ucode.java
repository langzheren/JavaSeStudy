package excercise.e4_9;

import java.util.Scanner;

public class Ucode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		String ssn = "";
		Scanner input = new Scanner (System.in);
		ssn = input.nextLine();
		System.out.println(ssn.length());
		System.out.println(ssn.substring(3, 4));
		if (ssn.length() ==11&&ssn.substring(3, 4).equals("-")&&ssn.substring(6, 7).equals("-")) {
			System.out.println(ssn+" is  a valid social security number");
		}else{
			System.out.println(ssn+" is an invalid social security number");
		}
		
	}

}
