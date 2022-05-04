package OOPs_Concepts.Abstraction;

abstract public class PersonCommonClass {
	
	String name;
	String clgName;

	//non abstract method
	public void taxCal() {
		System.out.println("Tax Cal.");
	}
	
	//abstract method
	public abstract void m2();

	 

}
