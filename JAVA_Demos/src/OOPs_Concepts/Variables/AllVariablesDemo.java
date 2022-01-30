package OOPs_Concepts.Variables;

public class AllVariablesDemo {
	int a=90 ;
	static int b = 200;

	public static void main(String[] args) {
		AllVariablesDemo obj = new AllVariablesDemo();
		AllVariablesDemo obj1 = new AllVariablesDemo();
		AllVariablesDemo obj2 = new AllVariablesDemo();
		AllVariablesDemo obj3 = new AllVariablesDemo();
		AllVariablesDemo obj4 = new AllVariablesDemo();
		System.out.println(obj.a);//0
		System.out.println(obj1.a);//0
		System.out.println(obj2.a);//0
		 obj3.a=1000;
		 System.out.println(obj3.a);//1000
		 System.out.println(obj4.a);//0
		 System.out.println(obj.a);//0
		 System.out.println(obj.b);//20
		 obj2.b=900;
		 System.out.println(obj4.b);//900 

	}

}
