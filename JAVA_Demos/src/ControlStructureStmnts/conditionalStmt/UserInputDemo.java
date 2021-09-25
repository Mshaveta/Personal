package ControlStructureStmnts.conditionalStmt;

import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		//Scanner -java builtin class
		//scn - any variable name / object / ref. variable
		//new - keyword
		//System- class
		//in - prop to give the input from system
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the first number:");
		int a = scn.nextInt(); // to take the value from user of int type
//		System.out.println("Please enter the second number:");
//		int b = scn.nextInt();
//		int sum = a+b;
//		System.out.println("Sum is- "+sum);
		
		
		if(a %2 ==0) {
			System.out.println("number is even");
		}else {
			System.out.println("number is odd");
		}
	}

}
