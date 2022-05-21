package OOPs_Concepts.interfacesDemos.Scenario5;

public class ClassA extends AbstractClass implements I1{
	
	@Override
	public void absMethod() {
		System.out.print("absMethod of AbstractClass");
	}

	public static void main(String[] args) {
		ClassA obj = new ClassA();
		obj.m1();
		obj.absMethod();
		obj.nonAbsMethod();

	}

	@Override
	public void m1() {
		System.out.print("m1 of I1");
		
	}

}
