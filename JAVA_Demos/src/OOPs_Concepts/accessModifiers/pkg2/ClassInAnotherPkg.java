package OOPs_Concepts.accessModifiers.pkg2;

import OOPs_Concepts.accessModifiers.pkg1.SameClass;

public class ClassInAnotherPkg {
	public void m1() {
		SameClass obj =  new SameClass();
		//System.out.println(obj.a);
		//System.out.println(obj.defaultVar);
		//System.out.println(obj.protectedVar);
		System.out.println(obj.publicVar);
		
	}
}
