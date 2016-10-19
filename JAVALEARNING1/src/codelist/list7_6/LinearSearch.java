package codelist.list7_6;

public class LinearSearch {

	public static int linearSearch(int[] list,int key){
		int b= 0;
		for(int i = 0; i<list.length;i++){
			
			if (key == list[i]) {
				b = i ;
				break;
			}else{
				b = -1;
			}
			
		}
		return b;
	}
}
