package OOPs_Concepts.interfacesDemos.InterfacesNewFeatures.defaultKeyword.scenario6;

abstract public class AbstractClassDemo implements I1 {

	abstract public void m1();
	
	public void m2() {
		 I1.super.m1();
	}

}
