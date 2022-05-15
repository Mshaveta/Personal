package OOPs_Concepts.interfacesDemos;

public class ChildA implements I1 {

	@Override
	public void m1() {
		System.out.println(a);
	}

	@Override
	public void m2() {
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {
		ChildA obj = new ChildA();
		obj.m1();
		obj.m2();
	}

}
