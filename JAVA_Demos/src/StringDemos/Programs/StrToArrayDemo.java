package StringDemos.Programs;

import java.util.Arrays;

public class StrToArrayDemo {
	public static void main(String[] args) {
		String name = "Jagroop Kaur";
		//Convert the Strung intoArray	
		char[] chArr = name.toCharArray();
		System.out.println(Arrays.toString(chArr));
		for(int i=0;i<chArr.length;i++) { //i=0;i<12
			System.out.print(chArr[i]);//Ja
		}
	}
}
