package excercise.e6_3;

import java.util.Scanner;

public class Reversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int in = input.nextInt();
		reverse(in);
		System.out.print(in +" is "+isPalindrome(reverse(in)) +"a Palindrome");
		
	}
	
	public static boolean reverse(int number){
		String num = String.valueOf(number);
		return new StringBuffer(num).reverse().toString().equalsIgnoreCase(num);
	}
	
	public static String isPalindrome(boolean number){
		return number?"":" not ";
		
	}

}
