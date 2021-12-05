package StringDemos;

import java.util.Arrays;

public class StringbuiltinMethods {
	public static void main(String[] args) {
		String str = "Test";
		String str1 = "DEMO";
		
		//Method1
		String newStr = str.concat(str1);
		System.out.println(newStr);
		
		//m2
		System.out.println(newStr.toLowerCase());
		System.out.println(newStr.toUpperCase());
		
		//m3
		System.out.println(newStr.length());
		
		
		String st = "testing";
		//m4----imp
		
		char ch = st.charAt(6);
		System.out.println("char at index 0 is- "+ch);
		
		//m5
		System.out.println("index no of char n - "+ st.indexOf('n'));
		
		//m6 -- convert String to Array--imp
		
		char[] chArr = st.toCharArray();
		System.out.println(Arrays.toString(chArr));//[t, e, s, t, i, n, g]
		
		 
		
	}
}
