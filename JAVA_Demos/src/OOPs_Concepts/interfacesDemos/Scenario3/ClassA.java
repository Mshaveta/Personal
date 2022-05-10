package OOPs_Concepts.interfacesDemos.Scenario3;

public class ClassA implements I1,I2 {

	@Override
	public void m2() {
		System.out.println("m2");
	}

	@Override
	public void m1() {
		System.out.println("m1");
	}
	
	@Override
	public void m3() {
		System.out.println("m3");
	}

	
	public static void main(String[] args) {
		ClassA obj =  new ClassA();
		obj.m1();
		obj.m2();
	}

	
}
