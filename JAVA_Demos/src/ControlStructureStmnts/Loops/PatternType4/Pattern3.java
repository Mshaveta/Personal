package PatternType4;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter no of Rows:");
		int n = scn.nextInt();

		 for(int row=1;row<=n;row++) 
		 {
			 
			 //for spaces
			 for(int space=1;space<=n-row;space++) {
				 System.out.print("- ");
			 }
			 
			//for stars
			 for(int star=1;star<=(2*row)-1;star++) {
				 System.out.print("* " );
			 }
//			 
			 
			 System.out.println();
		 }

	}

}
