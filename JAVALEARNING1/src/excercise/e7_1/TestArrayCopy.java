package excercise.e7_1;

public class TestArrayCopy {

	public static void copyArray(){
		int[] arr1 = {1,2,3,4,5};
		int[]	arr2=new int[arr1.length];
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		for (int i = 0; i < arr2.length; i++) {
			
			System.out.println(arr2[i]);
		}
	}
}
