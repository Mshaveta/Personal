package OOPs_Concepts.inheritance.ConstOverloading.recommendedApproach;

/* creating multiple object of child class to call all the consts of parent class is not a good approach.*/
public class ChildClass extends ParentClass {
	 public ChildClass(double a, int b) {
		 super(a,b);
	 }
	 
	public static void main(String[] args) {
		ChildClass obj = new ChildClass(12.5,23);
		 
	}
}
