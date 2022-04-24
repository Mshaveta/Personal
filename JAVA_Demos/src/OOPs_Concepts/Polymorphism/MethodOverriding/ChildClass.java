package OOPs_Concepts.Polymorphism.MethodOverriding;

public class ChildClass extends ParentClass {

	public void m1() {
		System.out.println("Method m1 in child class");
	}

	public void m2() {
		super.m1();
		System.out.println("Method m2 in child class");
	}
	
	 
}
