package excercise.e5_6;

public class MultiplicationTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("                   Multiplication Table");
		System.out.print("      ");
		for (int i = 1; i < 10; i++) {
			System.out.printf("    "+i);
		}
		for (int i = 1; i < 10; i++) {
			System.out.print( "\n"+i +"  |  ");
			for (int j = 1; j < 10; j++) {
				System.out.printf("%4d",i*j);
			}
		}
	}

}
