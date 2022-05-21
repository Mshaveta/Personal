package OOPs_Concepts.interfacesDemos.InterfacesNewFeatures.staticKeyword;
/*
 * Scenario1: I1 has static method and classA implements I1
 * Scenario1: I1,I2 have static methods and classA implements I1,I2
 * */
public interface I3 extends I2 {
	
	public static void m4() {
		System.out.println("m4 in I3");
		 
	}

}
