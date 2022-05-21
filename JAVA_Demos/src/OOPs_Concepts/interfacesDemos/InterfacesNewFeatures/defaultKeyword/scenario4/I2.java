package OOPs_Concepts.interfacesDemos.InterfacesNewFeatures.defaultKeyword.scenario4;
/*
 *  
 *  
 * */
public interface I2 extends I1 {
	
	public default void m2() {
		m1();
		System.out.println("default m2 in I2");
	}
	

}
