package excercises.e6_2;

public class CountFee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int fee = 10000;
		int count = 0 ;
		double futureFee = fee;
		double fu = 0;
		do{
			futureFee = futureFee*1.07;
			count ++;
			
		}while(futureFee <2*fee);
		System.out.println(count);
	}

}
