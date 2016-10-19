package excercise.e7_16;

import codelist.list7_6.LinearSearch;

public class SearchTime {

	/**
	 * 产生10w随机数，输出查找某值的时间
	 * @param args
	 */
	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		int[] arr = new int[100000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100000);
		}
		int a = (int) (Math.random() * 100);
		int index = LinearSearch.linearSearch(arr, a);
		System.out.println("the one's index is "+ index);
		long endTime = System.currentTimeMillis();
		
		System.out.println("use time :"+(endTime - startTime));
	}
	

}
