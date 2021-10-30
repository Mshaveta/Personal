package PatternType3;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter no of Rows:");
		int n = scn.nextInt();

	
		for (int row = 1; row <= n; row++) {
			char printNum = 'a';
			for (int col = 1; col <= (n+1)-row; col++) {
				System.out.print(printNum);
				printNum++;
			}
			
			
			
			System.out.println();
			 
		}

	}

}
