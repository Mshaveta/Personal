package OOPs_Concepts.accessModifiers.overridingWithModifiers;

public class ChildClass extends ParentClass {
	public int m1(int a) {
		System.out.println("Method in Child class");
		return a;
	}

	void m2() {
		System.out.println("default Method in child class");
	}

	protected void m3() {
		System.out.println("protected Method in child class");
	}

	public void m4() {
		System.out.println("public Method in child class");
	}

	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		System.out.println(obj.m1(10));
	}
}
