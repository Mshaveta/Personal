package OOPs_Concepts.interfacesDemos.Scenario2;

public class ClassA implements I2,I3 {

	@Override
	public void m1() {
		System.out.print("m1 of I1");
		
	}

	@Override
	public void m2() {
		System.out.print("m2 of I2");
		
	}

	
	public static void main(String[] args) {
		ClassA obj =  new ClassA();
		obj.m1();
		obj.m2();
	}

	@Override
	public void m3() {
		System.out.print("m3 of I3");
		
	}
}
