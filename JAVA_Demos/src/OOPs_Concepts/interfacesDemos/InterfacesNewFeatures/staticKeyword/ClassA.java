package OOPs_Concepts.interfacesDemos.InterfacesNewFeatures.staticKeyword;

public class ClassA implements I1 {
	public void m2() {
		I1.m1();
	}
	 
	public static void main(String[] args) {
		 
		  I1.m1();

	}

}
