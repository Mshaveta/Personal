package OOPs_Concepts.accessModifiers.overridingWithModifiers;

public class ParentClass {

	private int m1(int a) {
		System.out.println("Method in parent class");
		return a;
	}

	void m2() {
		System.out.println("default Method in parent class");
	}
	
	protected void m3() {
		System.out.println("protected Method in parent class");
	}
	
	public void m4() {
		System.out.println("public Method in parent class");
	}

}
