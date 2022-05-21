package OOPs_Concepts.interfacesDemos.InterfacesNewFeatures.defaultKeyword.scenario7;

public class ClassA extends AbstractClassDemo implements I1 {
	
	@Override
	public void m1() {
		I1.super.m1();
		System.out.println("Overridden method of Abs. class");
	}
	 
	public static void main(String[] args) {
		ClassA obj =  new ClassA(); 
		obj.m1();
	}

	

}
