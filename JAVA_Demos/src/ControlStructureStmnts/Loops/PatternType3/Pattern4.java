package PatternType3;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter no of Rows:");
		int n = scn.nextInt();

	
		for (int row = 1; row <= n; row++) {
			int printNum = row;
			for (int col = 1; col <= (n+1)-row; col++) {
				System.out.print(printNum);
				printNum++;
			}
			
			
			
			System.out.println();
			 
		}

	}

}
