package excercise.e6_1_k;

public class TranArgs {

	/**
	 * @param args
	 */
	
	static int x = 1;
	static int y = 2;
	
	public static void main(String[] args) {

		
		System.out.println("before the call,x is "+x+",y is "+y);
		
		increment(x);
		transValue(x, y);
		System.out.println("after the call , x is "+ x+" ,y is "+y);
	}
	
	public static void increment(int a){
		x = 4;
		a++;
		System.out.println("in the call ,a is "+a);
	}
	
	public static void transValue(int a,int b){
		int temp = a;
		a = b;
		b = temp;
		System.out.println("in the call ,a is "+a+",b is "+b);
	}

}
