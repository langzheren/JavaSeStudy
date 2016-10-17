package excercise.e4_23;

import java.math.BigDecimal;
import java.util.Scanner;

public class Gold {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name = "";
		double time = 0;
		double perSlr = 0;
		double ntvRate = 0;
		double sdtRate = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter employee's name:");
		name = input.next();
		System.out.print("Enter number of hours worked in a week:");
		time = input.nextDouble();
		System.out.print("Enter hourly pay :");
		perSlr = input.nextDouble();
		System.out.print("Enter federal tax withholding rate:");
		ntvRate = input.nextDouble();
		System.out.print("Enter state tax withholding rate:");
		sdtRate = input.nextDouble();
		System.out.println("Employee Name:"+name);
		System.out.printf("Hours Worked:%5.1f\n",time);
		System.out.printf("Pay Rate:  $%5.2f\n",perSlr);
		System.out.printf("Gross Pay:  $%5.2f\n",perSlr*time);
		System.out.println("Deductions:");
		System.out.printf("  Federal Withholding (%2.0f%%):  $%5.2f\n",ntvRate*100,ntvRate*perSlr*time);
		System.out.printf("  State Withholding (%2.0f%%):  $%5.2f\n",sdtRate*100,sdtRate*perSlr*time);
		System.out.printf("  Total Deduction:   $%5.2f\n",ntvRate*perSlr*time+sdtRate*perSlr*time);
		System.out.printf("Net  Pay :   $%5.2f\n",perSlr*time-(ntvRate*perSlr*time+sdtRate*perSlr*time));
		
	}

}
