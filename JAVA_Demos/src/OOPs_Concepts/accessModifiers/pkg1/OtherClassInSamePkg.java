package OOPs_Concepts.accessModifiers.pkg1;

public class OtherClassInSamePkg {
	public void m1() {
		SameClass obj =  new SameClass();
		//System.out.println(obj.privateVar);
		System.out.println(obj.defaultVar);
		System.out.println(obj.protectedVar);
		System.out.println(obj.publicVar);
	}
}
