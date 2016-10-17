package excercise.e5_27;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count = 0;
		System.out.println("\t\t\t\t闰年表");
		System.out.println("----------------------------------------------------------------------------");
		for (int i = 100; i < 2100; i++) {
			if ((i%4==0&&i%400!=0)||(i%400==0)) {
				count++;
				System.out.printf("%8d",i);
				while(count%10==0){
					System.out.println();
					break;
				}
			}
		}
	}

}
