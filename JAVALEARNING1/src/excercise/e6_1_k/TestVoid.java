package excercise.e6_1_k;

import java.util.Scanner;

public class TestVoid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		printGrade(a);
		System.out.println(printGradeReturn(a));
	}
	
	public static void printGrade(double a){
		if (a>=90) {
			System.out.println("you get a 'A'");
		}else if (a>=80){
			System.out.println("you get a 'B'");
		}else if (a>=70){
			System.out.println("you get a 'C'");
		}else if (a>=60){
			System.out.println("you get a 'D'");
		}else{
			System.out.println("you get a 'F'");
		}
	}
	
	public static String printGradeReturn(double a){
		if (a>=90) {
			return "A";
		}else if (a>=80) {
			return "B";
		}else if (a>=70) {
			return "C";
		}else if (a>=60) {
			return "D";
		}else{
			return "F";
		}
	}
}
