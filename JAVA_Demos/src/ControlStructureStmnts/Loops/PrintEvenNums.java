package ControlStructureStmnts.Loops;

import java.util.Scanner;

public class PrintEvenNums {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("How many times do you want to execute the statement?");
		int count = scn.nextInt();
		 for(int i=1;i<=count;i++) {
			 if(i%2==0) {
				System.out.println(i+" is an even no."); 
			 }else {
				 System.out.println(i+" is an odd no."); 
			 }
		 }

	}

}
