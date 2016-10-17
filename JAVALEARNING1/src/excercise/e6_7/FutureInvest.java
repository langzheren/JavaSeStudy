package excercise.e6_7;

import java.util.Scanner;

public class FutureInvest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("输入投资额：");
		double a1 = input.nextDouble();
		System.out.print("输入利率:[%]");
		double a2=( input.nextDouble()*100.00)/10000;
		System.out.print("输入年数:");
		int a3 = input.nextInt();
		futureInvestmentValue(a1, a2, a3);
		printValue(a1, a2, a3);
	}
	
	public static double futureInvestmentValue(
			double investmentAmount ,double monthlyInterestRate,int years){
			double out = investmentAmount*(Math.pow((monthlyInterestRate/12+1), years*12));
			System.out.printf("投资值是：%6.2f\n",out);
			
			return out;
	}
	
	public static void printValue(double investmentAmount ,double monthlyInterestRate,int years){
		for (int i = 1; i <= years; i++) {
			double temp =  investmentAmount*(Math.pow((monthlyInterestRate/12+1), i*12));
			System.out.printf("%6.2f\n",temp);
		}
	}
}
