package excercise.e3_2;

import java.util.Scanner;

public class Minus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num1= (int)(Math.random()*100);
		int num2= (int)(Math.random()*100);
		if (num1 < num2) {
			int temp = num2;
			num2 = num1;
			num1 = temp;
		}
		int sum = num1 - num2;
		Scanner input =new Scanner (System.in);
		System.out.println("What is "+num1+"-"+num2+"?");
		int a = input.nextInt();
		while(a!=sum) {
			System.out.println("Oh No!You are wrong,will try again?");
			System.out.println("yes or no?[1 yes/2 no]");
			int b = input.nextInt();
			if (b ==1) {
				a = input .nextInt();
			}else{
				System.out.println("Let's see the answer!");
				System.out.println(num1+"-"+num2+"="+sum);
				System.exit(1);
			}
			
					
		}
			System.out.println("Yes!You get it!");
		
	}

}
