package excercise.e3_2;

import java.util.Scanner;

public class Health {

	/**
	 * BMI 体质指数
	 * <18.5  偏瘦
	 * >= 18.5 && <25.0 正常
	 * >= 25 && <30 超重
	 * >= 30肥胖
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int BMI = input.nextInt();
		while(BMI != 0 ){
		if (BMI < 18.5) {
			System.out.println("偏瘦");
		}else if(BMI>=18.5 && BMI < 25 ){
			System.out.println("正常");
		}else if(BMI>=25 && BMI < 30 ){
			System.out.println("超重");
		}else{
			System.out.println("肥胖");
		}
		BMI = input.nextInt();
		}
		System.exit(1);
	}

}
