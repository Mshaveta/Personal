package OOPs_Concepts.interfacesDemos.InterfacesNewFeatures.defaultKeyword.scenario5;
/*
 *  
 *  
 * */
public interface I2 extends I1 {
	
	public default void m5() {
		I1.super.m5();
		System.out.println("default m5 in I2");
	}
	

}
