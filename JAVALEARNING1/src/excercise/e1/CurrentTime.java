package excercise.e1;

import java.util.Scanner;

public class CurrentTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int count = 0 ;
		long time = System.currentTimeMillis();
		for (int i = 0; i < 5; i++) {
			int num1 = (int) ((Math.random() * 1000)%10);
			
			int num2 = (int) ((Math.random() * 1000)%10);

			if (num1>num2) {
				int temp = num1;
				num1 =num2 ;
				num2 = num1;
			}
			System.out.println("what is "+num2+" - "+num1+"？");		
			int a = input.nextInt();
			if (a == num2- num1) {
				count++;
			}
		}
		long timeEnd = System.currentTimeMillis();
		System.out.println("共5题，答对了："+count+"题。使用了"+(timeEnd - time)/1000+"秒。");
	}

}
