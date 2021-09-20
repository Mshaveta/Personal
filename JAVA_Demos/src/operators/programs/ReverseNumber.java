package operators.programs;

public class ReverseNumber {

	public static void main(String[] args) {
		int n= 456;
		
		int rem1 = n % 10; // 172%10-->2
		
		n = n/10; // 172/10 ---> 17
		int rem2 = n%10;// 17%10-->7
		
		int rem3 = n/10;
		
		
		
		System.out.println("Reverse of a number is-"+ rem1+rem2+rem3);
		

	}

}
