package excercise.e1_11;

public class CountPelple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int p = 312032486;
		for (int j = 1; j<=5; j++) {
			
		
		for (int i = 1; i < 60*24*365; i++) {
			if (i%7==0) {
				p+=1;
			}
			if(i%13==0){
				p-=1;
			}
			if (i%45==0) {
				p+=1;
			}
			
		}
		System.out.println("第"+j+"年人口为："+p);
	}
	}
}
