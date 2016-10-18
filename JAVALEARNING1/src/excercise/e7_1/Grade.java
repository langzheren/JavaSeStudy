package excercise.e7_1;

import java.util.Scanner;

public class Grade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.print("type in how many students:");
		Scanner input = new Scanner(System.in);
		int in = input.nextInt();
		int[] arr = new int[in];
		
		for (int i = 0; i < in; i++) {
			System.out.print("type in "+i+" 's score:");
			arr[i] = input.nextInt();
		}
		
		getMark(arr);
		
	}
	
	public static void getMark(int[] arr){

		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>90) {
				System.out.println(i+" get A");
			}else if (arr[i]>80){
				System.out.println(i+" get B");
			}else if (arr[i]>70){
				System.out.println(i+" get C");
			}else if (arr[i]>60){
				System.out.println(i+" get D");
			}else{
				System.out.println(i+" get F");
			}
		}
	}

}
