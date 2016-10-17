package excercise.e7_1;

public class ArrayReverse {

	/**
	 * @param args
	 */
	public static void reverseArr(String[] args) {

		int[] list = {1,2,3,4,5};
		
		for (int i = 0,j=list.length-1; i < list.length; i++,j--) {
			int temp = list[i];
			list[i]=list[j];
			list[j]=temp;
		}
		System.out.println();
	}

}
