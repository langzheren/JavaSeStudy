package excercise.e5_1;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 0;
		int sum1 = 0;
		for (int i = 0; i < 10; i++) {
			sum+=i;
		}
		for (int i = 0; i < 10; ++i) {
			sum1+=i;
		}
		System.out.println(sum+" "+sum1);
	}

}
