package excercise.e6_31;

import java.util.Scanner;

public class CreditCard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("type in your code:");
		long in = input.nextLong();
		if (isValid(in)) {
			System.out.println(in+" is a valid card number");
		}else{
			System.out.println(in+" is a bad card number");
		}
	}
	
	public static boolean isValid(long number){
		int size = getSize(number);
		if (size>16||size<13) {
			System.out.println("longth not match.");
			System.exit(1);
		}
		if (prefixMatched(number,size)=="false") {
			System.out.println("prefix not match.");
			System.exit(1);
		}
		System.out.println(prefixMatched(number,size));
		
		int sum1 = sumOfDoubleEvenPlace(number,size);
		System.out.println(sum1);
		int sum2 = sumOfOddPlace(number,size);
		System.out.println(sum2);
		if (( sum1 + sum2) %10==0) {
			return true;
		}else{
			return false;
		}
		
	}
	
	public static int sumOfDoubleEvenPlace(long number,int d ){
		int sum = 0;
		for (int i = d-1; i >= 0; i--) {
			int a = (int) (number/Math.pow(10, i)% 10) ;
			sum += getDigit( a);
		}
		return sum;
	}
	
	public static int getDigit(int number){
		if (number <5) {
			number *=2;
		}else{
			number = ((number*2)%10)+number*2/10;
		}
		return number;
	}
	
	public static int sumOfOddPlace(long number , int d){
		int sum = 0;
		for (int i = d-1; i >= 0; i-=2) {
			sum += number /Math.pow(10, i)%10;
		}
		return sum;
	}
	
	public static String prefixMatched(long number,int d){
		String re = "";
		int a = (int) (number/(Math.pow(10, d-1)));
		int b = (int) (number/(Math.pow(10, d-2)));
		if (a==4) {
			re = "Visa card";
		}else if (a==5){
			re = "Master card";
		}else if (a==6){
			re = "Discover card";
		}else if (b==37){
			re = "Discover card";
		}else{
			re = "false";
		}
		return re;
	}
	
	public static int getSize(long d){
		int count = 1;
		int f = 1;
		while(f !=0){
			f = (int) (d/(10*Math.pow(10, count)));
			count++;
		}
		return count;
	}
	
//	public static int getPrefix(long number,int k){
//		
//	}

}
