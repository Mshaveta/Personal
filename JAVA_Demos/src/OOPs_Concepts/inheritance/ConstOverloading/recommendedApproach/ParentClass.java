package OOPs_Concepts.inheritance.ConstOverloading.recommendedApproach;

public class ParentClass {
	/* different no. of params*/
	public ParentClass() {
		System.out.println("Parent class Constructor with Zero params");
	}
	
	/* different type of params*/
	public ParentClass(int z) {
		this();
		System.out.println("Parent class Constructor with one int type param");
	}
	
	public ParentClass(double z) {
		this((int)z);
		System.out.println("Parent class Constructor with one double type param");
	}
	
	/* different sequence of params*/
	public ParentClass(int a, double z) {
		this(z);
		System.out.println("Parent class Constructor with one int and one double type param");
	}
	
	public ParentClass(double z, int a) {
		this(a,z);
		System.out.println("Parent class Constructor with one double and one int type param");
	}
	
 	
	
}
