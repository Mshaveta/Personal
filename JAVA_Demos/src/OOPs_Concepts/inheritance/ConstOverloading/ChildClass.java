package OOPs_Concepts.inheritance.ConstOverloading;

/* creating multiple object of child class to call all the consts of parent class is not a good approach.*/
public class ChildClass extends ParentClass {
	 public ChildClass(double a, int b) {
		 super(a,b);
	 }
	 
	 public ChildClass(int a) {
		 super(a);
	 }
	 
	 public ChildClass() {
		 //super();
		 System.out.println("child class non param const.");
	 }
	 
	 public ChildClass(double a) {
		 super(a);
	 }
	 public ChildClass(int a, double b) {
		 super(a,b);
	 }
	 
	public static void main(String[] args) {
		ChildClass obj = new ChildClass(12.5,23);
		ChildClass obj1 = new ChildClass(23);
		ChildClass obj2 = new ChildClass();
		ChildClass obj3 = new ChildClass(123.5);
		ChildClass obj4 = new ChildClass(23,78.90);
		 
	}
}
