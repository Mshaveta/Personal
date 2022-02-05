package OOPs_Concepts.Methods;

import java.util.Scanner;

public class ParametericMethods {

	public void sum(int a, int b) {
		System.out.println("sum starts here.....");
		int sum = a+b;
		System.out.println(sum);
		System.out.println("sum ends here.....");
	}

	public static void main(String[] args) {
		System.out.println("execution starts...");
		ParametericMethods obj = new ParametericMethods();
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter First Number");
		int num1 = scn.nextInt();
		System.out.println("Please enter second Number");
		int num2 = scn.nextInt();
		obj.sum(num1,num2);
		System.out.println("execution ends...");
		

		
	}

}
