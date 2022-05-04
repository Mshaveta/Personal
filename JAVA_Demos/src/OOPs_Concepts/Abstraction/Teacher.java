package OOPs_Concepts.Abstraction;

 public class Teacher extends PersonCommonClass  {
	double salary;
	
	
	@Override
	public void m2() {
		System.out.println("Method definition in Teacher class");
		
	}
	
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.clgName = "DSM";
		t.name="teacherName";
		t.taxCal();
		 
	}
	
}
