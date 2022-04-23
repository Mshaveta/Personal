package OOPs_Concepts.superKeyword;

public class ChildClass extends ParentClass {
	
	int a = 100;
	
	public ChildClass() {
		super(100);
		System.out.println("Child class const");
		//super(100); //can't call the const here, it should be first statement
	}

	public void callParentClassProp() {
		
		System.out.println("Child class variable - " + a);
		super.m1();
		System.out.println("Parent class variable - " + super.a);
	}

	public void m1() {
		
		System.out.println("Method defined in Child Class");
		super.m1();
	}

	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.callParentClassProp();
		obj.m1();
	}
}
