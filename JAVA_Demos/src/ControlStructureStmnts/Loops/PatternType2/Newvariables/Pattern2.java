package PatternType2.Newvariables;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter no of Rows:");
		int n = scn.nextInt();

		
		for (int row = 1; row <= n; row++) {
			int printNum = 1;
			for (int col = 1; col <= row; col++) {
				System.out.print(printNum);
				printNum++;
			}
			
			System.out.println();
			 
		}

	}

}
