package ControlStructureStmnts.Loops.PatternType3;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter no of Rows:");
		int n = scn.nextInt();

		int printNum = 1;
		for (int row = 1; row <= n; row++) {
			
			for (int col = 1; col <= (n+1)-row; col++) {
				System.out.print(col);
			}
			 
			System.out.println();
			 
		}

	}

}
