package excercise.e7_24;

public class PickDifferent {

	/**
	 * 找到4种颜色所需的抽牌次数
	 * @param args
	 */
	public static void main(String[] args) {
		String[] suits = {"Spades","Heart","Diamends","Clubs"};
		String[] rank = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		int[] arr = new int[52];
		for (int i = 0; i < arr.length; i++) {
			int b = (int) (Math.random()*52);
			int temp = arr[i];
			arr[i] = arr[b];
			arr[b] = temp;
		}
		int count = 0;
		int drow = (int) (Math.random()*52);
		int[] four = new int[4];
		boolean flag = true;
		while(flag){
			System.out.println("you get a "+suits[drow/13] + " " + rank[drow%13]);
			four[drow/13] ++;
			drow = (int) (Math.random()*52);
				if (four[0]!=0&&four[1]!=0&&four[2]!=0&&four[3]!=0) {
					flag = false;
				}
			count++;
		}
		System.out.println("you have get "+ four[0] + " "+suits[0]);
		System.out.println("you have get "+ four[1] + " "+suits[1]);
		System.out.println("you have get "+ four[2] + " "+suits[2]);
		System.out.println("you have get "+ four[3] + " "+suits[3]);
		
		System.out.println("total pick "+count+" times!");
		
	}

}
