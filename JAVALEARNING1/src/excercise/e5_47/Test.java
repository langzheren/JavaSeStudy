package excercise.e5_47;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String in = input.nextLine();
		while(in.length()!=12){
			System.out.println("输入数据长度不正确，请重新输入：");
			in = input.nextLine();
		}
		char[] chars = new char[12];
		int d13 = 0;
		int[] d = new int[12];
		for (int i = 0; i < 12; i++) {
			chars[i] = in.charAt(i);
			d[i] = (int)chars[i]-'0';
		}
		d13= 10 - (( d[0] + 3* d[1] +d[2] + 3 * d[3] + d[4] + 3* d[5] + d[6] + 3 * d[7]+ d[8] + 3 * d[9]+ d[10] + 3 * d[11])%10);
 
		if (d13== 10) {
			d13 = 0;
		}
		
		System.out.println(in +d13);
	}

}
