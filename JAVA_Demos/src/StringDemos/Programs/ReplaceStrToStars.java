package StringDemos.Programs;

import java.util.Arrays;

public class ReplaceStrToStars {
	public static void main(String[] args) {
		String str = "My name is Jagroop Kaur";
		String targetStr = "Jagroop";

		// convert to String type Array
		String[] strArr = str.split(" ");
		//System.out.println(Arrays.toString(strArr));// ["My", "name", "is", "Jagroop", "Kaur"]

		String newStr="";
		for (int i = 0; i < strArr.length; i++) {
				if(strArr[i].equals(targetStr)) {
					int wordlength = targetStr.length();
					for(int j=0;j<wordlength;j++) {
						newStr+="*";
					}
					newStr+=" ";
				}else {
					newStr+=strArr[i]+" ";
				}
		}
		
		System.out.println(newStr.trim());

	}
}
