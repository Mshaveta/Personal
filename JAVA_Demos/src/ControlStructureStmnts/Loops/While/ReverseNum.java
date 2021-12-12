package ControlStructureStmnts.Loops.While;

public class ReverseNum {

	public static void main(String[] args) throws InterruptedException {
		int num = 4251;
		int rem = 0;
		int rev = 0;

		while (num > 0) {
			rem = num % 10;
			rev = rev*10 + rem;
			num = num/10;
			 
		}
		
		
		System.out.println("Revsere of number is-"+rev);
		
		
		 

	}

}
