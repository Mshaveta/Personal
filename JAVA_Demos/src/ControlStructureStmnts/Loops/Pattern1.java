<<<<<<< Updated upstream
=======
package ControlStructureStmnts.Loops;
>>>>>>> Stashed changes

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter no of Rows:");
		int n=scn.nextInt();
		 for(int i=1;i<=n;i++) {
			 for(int j=1;j<=n ; j++) {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }

	}

}
