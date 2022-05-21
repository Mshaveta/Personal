package OOPs_Concepts.interfacesDemos.Scenario4;

public class ClassA extends AbstractClass  {

	@Override
	public void m1() {
		System.out.print("m1 of I1");
	}

	public static void main(String[] args) {
		ClassA obj = new ClassA();
		obj.m1();
	}

	@Override
	public void absMethod() {
		System.out.print("absMethod of AbstractClass");
	}

}
