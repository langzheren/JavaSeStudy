package excercise.e7_21;

import java.util.Scanner;

public class Slots {

	/**
	 * 豆机实验
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		System.out.println("how many bean(s) are there?:");
		int beans= input.nextInt();
		System.out.println("how many slots ?");
		int slots = input.nextInt();
		int[] arr = new int[slots];
		int[] pt = new int[beans];
		
		//所有的结果
		for (int i = 0; i < beans; i++) {
			//每次的结果
			for (int j = 0; j < slots; j++) {
			int count = (int) (Math.round(Math.random()));
			arr[i] =count ;
			if (arr[i]==0) {
					System.out.print("L");
				}else{
					System.out.print("R");
					pt[i]++;
				}
			}
			System.out.println();
		}
		
		for (int i = 0; i < beans; i++) {
			for (int j = 0; j < pt[i]; j++) {
				System.out.printf("%4s","|");
			}
			System.out.println("0");
			
		}
	}

}
