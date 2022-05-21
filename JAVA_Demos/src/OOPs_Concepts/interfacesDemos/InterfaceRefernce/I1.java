package OOPs_Concepts.interfacesDemos.InterfaceRefernce;

public interface I1 {
	int a=10;//bydefault variable public ,static final
	
	public void m1();
	
	public default void m2() {
		System.out.println("default method of I1 m2()");
	}
	
	public default void m4() {
		System.out.println("m4 method in I1...");
	}
}
