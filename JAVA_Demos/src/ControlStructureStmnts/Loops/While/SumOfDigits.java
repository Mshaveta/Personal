package ControlStructureStmnts.Loops.While;

public class SumOfDigits {
	public static void main(String[] args) {
		int num=111111111;
		int sum=0;
		int rem=0;
		while(num>0) {
			rem = num % 10;
			sum = sum + rem;
			num = num /10;
			 
		}
		System.out.println("Sum is-"+ sum);
	}
}
