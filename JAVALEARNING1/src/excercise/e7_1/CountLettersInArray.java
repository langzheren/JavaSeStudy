package excercise.e7_1;

import tools.RandomCharacter;

public class CountLettersInArray {
	
	public static void count(){
		
		char[] chars = creatArray();
		System.out.println("小写为：");
		displayArray(chars);
		int[] counts =countLetters(chars);
		
		System.out.println();
		System.out.println("The occurrences of each letter are:");
		displayCounts(counts);
	}
	
	public static char[] creatArray(){
		char[] chars = new char[100];
		for (int i = 0; i < 100; i++) {
			chars[i] = RandomCharacter.getRandomLowerCaseLetter();
			
		}
		return chars;
	}
	
	public static void displayArray(char[] chars){
		for (int i = 0; i < chars.length; i++) {
			if ((i+1)%20 == 0) {
				System.out.println(chars[i]);
			}else{
				System.out.print(chars[i]+"  ");
			}
		}
	}
	
	public static int[] countLetters(char[] chars){
		int[] counts = new int[26];
		for (int i = 0; i < chars.length; i++) {
			counts[chars[i]-'a']++; 
		}
		return counts;
	}
	
	public static void displayCounts(int[] counts){
		for (int i = 0; i < counts.length; i++) {
			if ((i+1)%10==0) {
				System.out.println(counts[i]+"个"+(char)(i + 'a'));
			}else{
				System.out.print(counts[i] + "个" + (char)(i + 'a')+"  ");
			}
		}
	}

}
