package OOPs_Concepts.ExceptionHandling;

public class ThrowKeyword {
	
	public void checkNumbers() {
		int a=100;
		int b=20;
		if(a>b) {
			try {
				throw new ArithmeticException("a is greater than b");
			}catch(Exception e) {
				e.printStackTrace();
				
			}
		}
	}
	
	public static void main(String[] args) {
		ThrowKeyword tk = new ThrowKeyword();
		System.out.println("Start...");
		tk.checkNumbers();
		System.out.println("End...");
	}
}
