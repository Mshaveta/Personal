package ControlStructureStmnts.Loops;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter no of Rows:");
		int n=scn.nextInt();
		 for(int row=1;row<=n;row++) {
			 for(int col=1;col<=n ; col++) {
				 if(row==1 || row==n || col==1 || col==n) {
					 System.out.print("* ");
				 }else {
					 System.out.print("  ");
				 }
				 
			 }
			 System.out.println();
		 }


	}

}
