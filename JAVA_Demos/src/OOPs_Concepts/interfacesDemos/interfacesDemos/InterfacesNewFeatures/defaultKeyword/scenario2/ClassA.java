package OOPs_Concepts.interfacesDemos.InterfacesNewFeatures.defaultKeyword.scenario2;

public class ClassA implements I1,I2 {
	 
	public void m2() {
		 m1();
		 m2();
	}
	
	public static void main(String[] args) {
		ClassA obj =  new ClassA();
		obj.m1();
		obj.m2();
		
	}

}
