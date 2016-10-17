package excercises.e4_2;

import java.util.Scanner;

public class GuestNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		int guestNum = (int) (Math.random()*100);
		int num = input.nextInt();
		while(guestNum != num){
			if (guestNum>num) {
				System.out.println("your num is too small!try again:");
				num = input.nextInt();
			}else if (guestNum<num){
				System.out.println("your num is too big!try again:");
				num = input.nextInt();
			}
		}
		System.out.println("ok !that is it!");
	}

}
