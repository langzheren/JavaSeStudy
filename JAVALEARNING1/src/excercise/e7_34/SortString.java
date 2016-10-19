package excercise.e7_34;

import java.util.Scanner;

public class SortString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[] arr = input.nextLine().toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i]<arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j ] = temp;
				}
			}
		}
		
		System.out.println(String.valueOf(arr));
	}
}
