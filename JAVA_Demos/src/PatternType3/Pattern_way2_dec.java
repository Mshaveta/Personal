package PatternType3;

import java.util.Scanner;

public class Pattern_way2_dec {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter no of Rows:");
		int n = scn.nextInt();

		 
		for (int row = 1; row <= n; row++) {
			
			for (int col = n; col>=row; col--) {
				System.out.print("*");
			}
			 
			System.out.println();
			 
		}

	}

}
