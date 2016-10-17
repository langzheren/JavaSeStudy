package excercise.e3_1;

import java.util.Scanner;

public class Trans {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		switch(a){
		case 1:System.out.println("1");break;
		case 2:System.out.println("2");break;
		case 3:System.out.println("3");break;
		default:System.out.println("nothing");
		System.exit(1);
		}
		
		
	}

}
