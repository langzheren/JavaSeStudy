package excercises.e3_4;

import java.util.Scanner;

public class GetTax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		byte m = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("tap in your money:");
		int money = input.nextInt();
		System.out.println("single or merried?[0 single/1 separately/2 household]");
		m = input.nextByte();
		if (m == 0) {
			int tax = 0;
			if (money<=8350) {
				tax = (int) (money * 0.1);
			}
			if (money>=8351 && money <=33950){
				tax = (int) ((8350 * 0.1)+((money - 8350) * 0.15));
			}
			if (money>=33951 && money <=82250){
				tax = (int) ((8350 * 0.1)+(33950-8350) * 0.15+(money - 33950) * 0.25);
			}
			if (money>=82251 && money <=171550){
				tax = (int) ((8350 * 0.1)+(33950-8350) * 0.15+(82251 - 33951)*0.25 + (money - 82250) * 0.28);
			}
			if (money>=171551 && money <=372950){
				tax = (int) ((8350 * 0.1)+(33950-8350) * 0.15+(82251 - 33951)*0.25 +(171551 - 82251)*0.28+(money - 82250) * 0.33);
			}
			if (money>=372951){
				tax = (int) ((8350 * 0.1)+(33950-8350) * 0.15+(82251 - 33951)*0.25 +(171551 - 82251)*0.28+(372951 - 82250) * 0.33+(money - 82250) * 0.35);
			}
			System.out.println("you must give tax :"+tax);
		}
			
		
	}

}
