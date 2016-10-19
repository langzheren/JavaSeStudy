package excercise.e7_18;

import java.util.Arrays;
/**
 * 冒泡排序法
 * @author yangfm
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {2,5,6,8,1,8,4,5,5,1};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[j]<arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
