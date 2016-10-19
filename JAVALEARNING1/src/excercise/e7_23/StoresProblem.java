package excercise.e7_23;

import java.util.Arrays;

public class StoresProblem {

	/**
	 * 储物柜问题
	 * @param args
	 */
	public static void main(String[] args) {

		boolean[] arr = new boolean[5];
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i; j < arr.length; j=j+1+i) {
				arr[j] = !arr[j];
			}
			System.out.println(Arrays.toString(arr));

		}
		System.out.println(Arrays.toString(arr));
	}

}
