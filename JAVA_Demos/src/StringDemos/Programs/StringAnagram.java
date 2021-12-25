package StringDemos.Programs;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter first string ");
		String s1 = scn.nextLine();
		System.out.println("Please enter second string ");
		String s2 = scn.nextLine();
		
		//check the length of strings
		if(s1.length() == s2.length()) {
			System.out.println("Same");
			// convert to Lowercase
			s1 = s1.toLowerCase();
			s2 = s2.toLowerCase();
			
			//Convert to Array
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
//			System.out.println(Arrays.toString(ch1));//[l, i, s, t, e, n]
//			System.out.println(Arrays.toString(ch2));//[s, i, l, e, n, t]
//			
			//Sort the Arrays
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
//			System.out.println(Arrays.toString(ch1));//[e, i, l, n, s, t]
//			System.out.println(Arrays.toString(ch2));//[a, e, l, n, s, t]
//			
			boolean status = false;
			for(int i=0;i<ch1.length;i++) {
				if(ch1[i]!=ch2[i]) {
					status = true;
					break;
				}
			}
			
			if(status) {
				System.out.println("Strings are not an anagram");
			}else {
				System.out.println("Strings are anagram");
			}
			
		}else {
			System.out.println("length of both the strings is not same.");
		}		
	}
}
