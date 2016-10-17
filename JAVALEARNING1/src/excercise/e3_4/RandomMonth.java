package excercise.e3_4;

public class RandomMonth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double r1 = Math.random() ;
		System.out.println(r1);
		int r = (int) (r1*12+1);
		String m = "";
		System.out.println("随机数是："+r);
		switch (r){
		case 1: m ="一月份";break;
		case 2: m ="二月份";break;
		case 3: m ="三月份";break;
		case 4: m ="四月份";break;
		case 5: m ="五月份";break;
		case 6: m ="六月份";break;
		case 7: m ="七月份";break;
		case 8: m ="八月份";break;
		case 9: m ="九月份";break;
		case 10: m ="十月份";break;
		case 11: m ="十一月份";break;
		case 12: m ="十二月份";break;
		default : System.out.println("数据错误！");
		}
		System.out.println("对应的月份是："+ m);
	}

}
