package OOPs_Concepts.interfacesDemos.InterfacesNewFeatures.defaultKeyword.scenario6;

public class ClassA extends AbstractClassDemo {
	
	@Override
	public void m1() {
		 System.out.println("@Overridden method of abstract class in child class");
		 
	}
	 
	public static void main(String[] args) {
		ClassA obj =  new ClassA(); 
		obj.m1();
	}

}
