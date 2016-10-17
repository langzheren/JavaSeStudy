package excercise.e7_1;

public class ArrayTest {

	/**
	 * @param args
	 */
	public static void Deck(int index) {
		String[] suits = {"Spades","Hearts","Diamends","Clubs"};
		String[] ranks={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		System.out.println("输入的值是："+index);
		int[] deck = new int[52];
		//定义一副扑克
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		//洗牌
		for (int i = 0; i < deck.length; i++) {
			int a = (int) (Math.random()*51);
			int temp = deck[i];
			deck[i] = deck[a];
			deck[a] = temp;
		}
		
		System.out.println("花色是："+suits[deck[index-1]/13]);
		System.out.println("是张："+ranks[deck[index-1]%13]);
		
		
	}

}
