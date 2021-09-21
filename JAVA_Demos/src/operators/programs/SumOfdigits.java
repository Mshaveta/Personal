package operators.programs;

public class SumOfdigits {
	public static void main(String[] args) {
		//int n,r1,r2,r3,sum;
		//or
		int n=156;//12
		//System.out.println(n);//123
		
		int digit1 = n%10;
		//System.out.println(d1);//3
		
		n = n/10;//12
		System.out.println(n);//12
		
		//for digit-2
		int digit2 = n%10;
		System.out.println(digit2);//2
		
		//for digit-3 (1)
		int digit3 = n/10;
		System.out.println(digit3);//12
		
		int sum = (digit1)+digit2+digit3;
		System.out.println("Sum of digits is-"+sum);
		
	}
}
