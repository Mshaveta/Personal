package OOPs_Concepts.interfacesDemos.InterfacesNewFeatures.staticKeyword;
/*
 * Scenario1: I1 has static method and classA implements I1
 * Scenario1: I1,I2 have static methods and classA implements I1,I2
 * */
public interface I2 {
	
	public static void m2() {
		System.out.println("m2 in I2");
	}

	public static void m3() {
		System.out.println("m3 in I2");
	}

}
