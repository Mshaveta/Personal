package OOPs_Concepts.accessModifiers.pkg1;

public class SameClass {
	private int privateVar = 10;
	int defaultVar = 100; //default
	protected int protectedVar=200;
	public int publicVar=500;

	public void m1() {
		System.out.println(privateVar);
		System.out.println(defaultVar);
		System.out.println(protectedVar);
		System.out.println(publicVar);
	}

	 
}
