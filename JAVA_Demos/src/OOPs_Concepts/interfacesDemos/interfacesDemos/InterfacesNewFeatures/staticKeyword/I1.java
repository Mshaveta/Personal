package OOPs_Concepts.interfacesDemos.InterfacesNewFeatures.staticKeyword;
/*
 * Scenario1: I1 has static method and classA implements I1
 * Scenario1: I1,I2 have static methods and classA implements I1,I2
 * */
public interface I1 {
	
	public static void m1() {
		System.out.println("m1 in I1");
	}
	
	public static void m3() {
		System.out.println("m3 in I1");
	}

}
