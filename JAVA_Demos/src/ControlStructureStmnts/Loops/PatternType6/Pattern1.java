package PatternType6;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter no of Rows:");
		int n = scn.nextInt();
		int half = (n+1)/2;
		int st=1,sp=1;
		 
		 for(int row=1;row<=n;row++) 
		 {
			 if(row<=half) {
				 sp=half-row;
				 st=row;
			 }else {
				 sp++;
				 st--;
			 }
			//for spaces
			 for(int space=1;space<=sp;space++) {
				System.out.print("-"); 
			 }
			 
//			//for stars
			 for(int star=1;star<=st;star++) {
				 System.out.print("* "); 
			 }
			 
			 
			 System.out.println();
		 }

	}

}
