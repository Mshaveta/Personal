package PatternType2;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter no of Rows:");
		int n = scn.nextInt();
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {

				System.out.print("1");

			}
			System.out.println();
		}

	}

}
