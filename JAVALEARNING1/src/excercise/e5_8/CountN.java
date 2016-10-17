package excercise.e5_8;

import java.util.Scanner;

public class CountN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		int pos=0,neg= 0;
		int count =1;
		double total=0,ave = 0;
		while(true){
			int a = input.nextInt();
			if(a==0){
				break;
			}else if(a<0){
				neg++;
			}else if(a>0){
				pos++;
			}
			total+=a;
			ave=total/count++;
		};
		System.out.println(pos+" "+neg+" "+total+" "+ave);
	}

}
