package OOPs_Concepts.ExceptionHandling;

public class ThrowsKeyword {
	
	public void m1() throws InterruptedException {
		System.out.println("Hello");
		Thread.sleep(5000);
		System.out.println("JAVA");
	}
	
	public void m2() throws InterruptedException   {
		m1();
	}
	
	public static void main(String[] args) throws InterruptedException {
		ThrowsKeyword tk = new ThrowsKeyword();
		tk.m1();
	}
}
