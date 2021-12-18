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
		
		
		//Split the String
		String name = "Jagroop Kaur";
		String[] stArr = name.split(" ");
		System.out.println(Arrays.toString(stArr));
		
		String date = "15-12-2021";
		String[] dateArr = date.split("-");//[15, 12, 2021]
		System.out.println(Arrays.toString(dateArr));//[15, 12, 2021]
		System.out.println("Year - "+dateArr[2]);
		
		
		//Replace
		String st1 = "Automation Testing";
		st1 = st1.replace('t', 'p');
		System.out.println(st1);
		
		String st2 = "Manual testing and Automation testing";
		st2 = st2.replaceAll("test", "abcd");
		 System.out.println(st2);
		 
		 //Substring
		 String st3 = "JagroopKaur tetsing";
		 st3 = st3.substring(3);//starts from 3 index till end 
		 st3 = st3.substring(7,13);// excluding 13 index no , 7-12 index nos
		 System.out.println(st3);
		 
		 
		 
		 
	}
}
