import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter no of Rows:");
		int n=scn.nextInt();
		//to check whether row number is even or odd
		if(n%2==0) {
			n=n+1;
		}
		 for(int row=1;row<=n;row++) {
			 for(int col=1;col<=n ; col++) {
				 if(row==col || col==((n+1)-row)) {
					 System.out.print("* ");
				 }else {
					 System.out.print("  ");
				 }
				 
			 }
			 System.out.println();
		 }


	}

}
