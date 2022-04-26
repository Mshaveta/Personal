package OOPs_Concepts.accessModifiers.pkg2;

import OOPs_Concepts.accessModifiers.pkg1.SameClass;

public class ChildClassInAnotherPkg extends SameClass {
	
	public void m2() {
		//System.out.println(a);
		//System.out.println(defaultVar);
		System.out.println(protectedVar);
		System.out.println(publicVar);
	}
}
