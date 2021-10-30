package PatternType5;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter no of Rows:");
		int n = scn.nextInt();
		int half = (n+1)/2;
		int st=1;
		int num=1;
		 for(int row=1;row<=n;row++) 
		 {
			 //upper half pattern
			 if(row<=half) {
				 st=row;
			 }else {
				 //for lower half pattern
				  st--;
			 }
			 
			//for stars
			 for(int star=1;star<=st;star++) {
				 System.out.print(num*2+" ");
				 num++;
			 }
			 
			 
			 System.out.println();
		 }

	}

}
