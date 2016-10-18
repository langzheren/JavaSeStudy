package excercise.e7_1;

import java.util.Arrays;
import java.util.Scanner;

public class SearchKey {

	/**
	 * @param args
	 */
	public static void main(String x[]) {

		Scanner input = new Scanner(System.in);
		int[] a = {15,10,11,8,22,33,48,88,448};
		System.out.println("the arr is :");
		System.out.println(Arrays.toString(a));
	

		selectionSort(a);
		System.out.println("\nafter selectionSort\n"+Arrays.toString(a));
		int[] c = {15,10,11,8,22,33,48,88,448};
		System.out.println("c is "+ Arrays.toString(c));
		java.util.Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		//jdk1.8多线程处理		Arrays.parallelSort(arr);		
		System.out.print("\nenter your num:");
		int b = input.nextInt();
		System.out.println("the right one's index is :  "+binarySearch(a, b));
		
	}
	
	public static int binarySearch(int[] list,int key){
		int low = 0;
		int high = list.length -1;
		while(high >= low){
			int mid = (low + high)/2;
			if (key<list[mid]) {
				high = mid -1;
			}else if(key == list[mid]){
				return mid;
			}else{
				low = mid + 1;
			}
		}
			return -low-1;
	}

	//数组传引用，直接对数组进行了操作
	public static void selectionSort(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

	}
}
