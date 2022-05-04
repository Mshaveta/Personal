package OOPs_Concepts.Abstraction;

public class Student extends PersonCommonClass{
	double fees;

	@Override
	public void m2() {
		System.out.println("Method definition in Student class");
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.clgName = "DSM";
		s.name="teacherName";
		s.taxCal();
		 
	}
}
