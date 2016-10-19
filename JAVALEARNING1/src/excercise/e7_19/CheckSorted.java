package excercise.e7_19;

import java.util.Scanner;

public class CheckSorted {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		int a = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i ]< arr[i+1]) {
				a++;
			}
		}
		if (a == arr.length-1) {
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
		
	}
}
