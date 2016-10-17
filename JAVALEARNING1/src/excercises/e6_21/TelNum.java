package excercises.e6_21;

import java.util.Scanner;

public class TelNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("输入一个号码");
		Scanner input = new Scanner (System.in);
		String num = input.nextLine();
		num = num.toLowerCase();
		System.out.println();
		char[] arr = num.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>'a'||arr[i]<'z') {
				switch(arr[i]){
				case 'a':
				case 'b':
				case 'c':arr[i]='2';break;
				case 'd':
				case 'e':
				case 'f':arr[i]='3';break;
				case 'g':
				case 'h':
				case 'i':arr[i]='4';break;
				case 'j':
				case 'k':
				case 'l':arr[i]='5';break;
				case 'm':
				case 'n':
				case 'o':arr[i]='6';break;
				case 'p':
				case 'q':
				case 'r':
				case 's':arr[i]='7';break;
				case 't':
				case 'u':
				case 'v':arr[i]='8';break;
				case 'w':
				case 'x':
				case 'y':
				case 'z':arr[i]='9';break;
		
				
				}
			}
		}
		System.out.print("your num is:"+String.valueOf(arr));
		
	}

}
