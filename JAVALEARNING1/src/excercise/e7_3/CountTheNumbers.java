package excercise.e7_3;

import java.util.Scanner;

public class CountTheNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int in = input.nextInt();
		int[] arr = new int[100];
		int[] count = new int[100];
		int i = 0;
		while(in !=0){
			arr[i] = in;
			in = input.nextInt();
			i++;
		}
		for (int j = 0; j <=i; j++) {
			count[arr[j]] ++;
		}
		for (int j = 1; j < count.length; j++) {
			if (count[j] == 1) {
				System.out.println(j + " occurs " +count[j]+" time");
			}
			if (count[j]>1) {
				System.out.println(j + " occurs " + count[j] + " times");
			}
		}
	}
	


}
