package OOPs_Concepts.Polymorphism.MethodOverloading;

public class MethodOverloading {
	
	/* method having same name with different number of params*/ 
	public void m1() {
		System.out.println("method with zero Arg");
	}
	
	public void m1(int a) {
		System.out.println("method with one int type Arg");
	}
	
	/* method having same name with different type of params*/ 
	public void m1(int a, float b) {
		System.out.println("method with two Args");
	}
	
	public void m1(String a, String b) {
		System.out.println("method having  two String type Args");
	}
	
	/* method having same name with different sequence of params*/ 
	public void m1(float b, double x) {
		System.out.println("method having  two String type Args");
	}
	
	public double m1(double x , float z ) {
		System.out.println("method having  two diff sequence of  Args");
		return x;
	}
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.m1(10);
		obj.m1();
		obj.m1(12.34 ,12.4f);
	}

}
