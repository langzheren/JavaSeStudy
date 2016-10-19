package excercise.e7_22;

import java.util.Arrays;

public class EightQueen {

	/**
	 * 
	 * 八車问题
	 * @param args
	 */
	public static void main(String[] args) {

		int[] row = new int[8];

		
		for (int i = 0; i < row.length; i++) {

			int b=  (int) (Math.random()*8+1);
			while(Arrays.toString(row).contains(String.valueOf(b))){
				b=  (int) (Math.random()*8+1);
			}
				row[i] =b;
		}
		
		System.out.println(Arrays.toString(row));
		
		for (int i = 1; i < row.length; i++) {
			for (int j = 1; j <= row.length; j++) {
				if (row[i] != j) {
					System.out.print("|  ");
				}else{
					System.out.print("|Q");
				}
			}
			System.out.print("|\n");
		}
	}

}
