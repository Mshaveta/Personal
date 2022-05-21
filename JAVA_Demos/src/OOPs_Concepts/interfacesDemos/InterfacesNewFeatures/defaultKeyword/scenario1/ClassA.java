package OOPs_Concepts.interfacesDemos.InterfacesNewFeatures.defaultKeyword.scenario1;

public class ClassA implements I1 {
	 
	public void m2() {
		 m1();	
	}
	
	public static void main(String[] args) {
		ClassA obj =  new ClassA();
		obj.m1();
		
	}

}
