package OOPs_Concepts.interfacesDemos.InterfaceRefernce;

public class ClassA implements I1 {
	int a=8900;//0, modifier/scope - default (within same pkg)
	
	@Override
	public void m1() {
		System.out.println("m1 method....");
	}
	
	public void m4() {
		I1.super.m4();
		System.out.println("m4 method in child class...");
	}
	
	public static void main(String[] args) {
		//creating a reference of interface and object of class
		//left side there can be any parent classNAme or Interface Name or abstract class
		// we can access the properties & methods of parent/left side class/Interface and overridden methods of child class 
		I1 i = new ClassA(); //Complex Object
		System.out.println(I1.a);
		i.m1();//m1 method....
		i.m2();
		i.m4();
		
	}

	
}
