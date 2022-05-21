package OOPs_Concepts.interfacesDemos.InterfacesNewFeatures.defaultKeyword.scenario3;

public class ClassA implements I1,I2 {
	 
	public void m2() {
		 m1();  
	}
	
	@Override
	public void m1() {
		System.out.println("Overridden method in classA");
		I1.super.m1();
		I2.super.m1();
	}

	public static void main(String[] args) {
		ClassA obj =  new ClassA();
		obj.m1(); 
	}

}
