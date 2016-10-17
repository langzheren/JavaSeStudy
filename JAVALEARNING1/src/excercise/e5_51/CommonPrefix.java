package excercise.e5_51;

import java.util.Scanner;

public class CommonPrefix {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int count = 0;
		boolean b = true;
		System.out.print("输入第一段字符:");
		String a1 = input.nextLine();
		System.out.print("输入第二段字符");
		String a2 = input.nextLine();
		//保证a1比a2长
		if (a1.length()<a2.length()) {
			String temp = a1;
			a1 = a2;
			a2 = temp;
		}
		while(b){
			for (int j = 0; j <a2.length() ; j++) {
				if (a1.substring(j, j+1).equals(a2.substring(j, j+1))) {
					count ++;
				}else{
					b = false;
				}
			}
		}
		if (count == 0) {
			System.out.println("输入的两个句子前缀都不相符！");
		}else{
			System.out.println("有"+count+"个前缀相符。");
		}
		
	}
	
}
