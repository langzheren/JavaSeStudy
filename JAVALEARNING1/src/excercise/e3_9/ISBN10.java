package excercise.e3_9;

import java.util.Scanner;

public class ISBN10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String in = "";
		String asd ="";
		char[] s ;
		int d1,d2,d3,d4,d5,d6,d7,d8,d9,d10 = 0;
		
		Scanner input = new Scanner(System.in);
		in = input.nextLine();
		if (in.length()!=9) {
			System.out.println("输入的长度不对！请重输：");
			in = input.nextLine();
		}
	
		s =in.toCharArray();
		
		System.out.println(s);
		d1 =(int) s[0]-48;
		d2=(int) s[1]-48;
		d3 =(int) s[2]-48;
		d4 =(int) s[3]-48;
		d5 =(int) s[4]-48;
		d6 =(int) s[5]-48;
		d7=(int) s[6]-48;
		d8 =(int) s[7]-48;
		d9 =(int) s[8]-48;
		System.out.println(d1);
		System.out.println(d2);
		d10 = (d1*1 + d2*2 +d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;
		System.out.println(d10);

		if (d10 == 10) {

			System.out.print("The ISBN-10 number is :"+d1);
			System.out.print(d2);
			System.out.print(d3);
			System.out.print(d4);
			System.out.print(d5);
			System.out.print(d6);
			System.out.print(d7);
			System.out.print(d8);
			System.out.print(d9);
			System.out.print("x");
		}else{
			System.out.print("The ISBN-10 number is :"+d1);
			System.out.print(d2);
			System.out.print(d3);
			System.out.print(d4);
			System.out.print(d5);
			System.out.print(d6);
			System.out.print(d7);
			System.out.print(d8);
			System.out.print(d9);
			System.out.print(d10);
		}
		
	}

}
