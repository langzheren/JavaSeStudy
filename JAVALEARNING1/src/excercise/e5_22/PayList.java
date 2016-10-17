package excercise.e5_22;

public class PayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double sum = 0;
		double a = 1.0/50000;
		System.out.println(a);
		
		for (double i = 50000; i >0; i--) {
			sum = sum + (1/i);
		}
		System.out.println(sum);
		
		double sum1 = 0;
		for (double i = 1; i < 50000; i++) {
			sum1 = sum1 + (1/i);
		}
		System.out.println(sum1);
	}

}
