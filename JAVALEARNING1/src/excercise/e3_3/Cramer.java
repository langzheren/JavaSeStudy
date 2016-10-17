package excercise.e3_3;

import java.util.Scanner;

/**
 * 二元一次方程组
 * @author yangfm
 *
 */
public class Cramer {
	public static void main(String[] args) {
		double a,b,c,d,e,f= 0;
		double x,y;
		System.out.println("输入6个参数：");
		Scanner input = new Scanner (System.in);
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		d = input.nextDouble();
		e = input.nextDouble();
		f = input.nextDouble();

		System.out.println("六个参数是："+a+","+b+","+c+","+d+","+e+","+f);
		
		if (a*d - b*c == 0) {
			System.out.println("方程无解");
		}else{
			x = (e*d - b*f)/(a*d - b*c);
			y = (a*f - e*c)/(a*d - b*c);
			System.out.println("x 为："+x+","+"y 为："+y);
		}
	}
	
	
}
