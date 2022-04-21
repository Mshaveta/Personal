package OOPs_Concepts.staticKeyword;

/*
 * Static Variable - No need to create an object of class
 * position: inside the class and outside the method and we need to use static keyword
 * level: class level variable
 * No need to initialise the static variable at the time of declaration
 * By default value of static variable is according to it's data type.
   for eg: int - 0,float- 0.0, boolean- false, String-null
 * Static variables get initialised at the time of class loading (.class - bytecode)
 * Access:we can access static variable directly or  by using className in static/nonstatic area/method directly,  
 * Why static variable is known as class level variable?-  because static variable get 
   initialised at the time of class loading
 * static variables share the memory- Value of static variable doesn't varies as we create different objects of class
 */
public class StaticVariable 
{
	static int b=100;
		
	public void m1() {
		System.out.println(b);
	}
	public static void main(String[] args) {
		System.out.println(b);
		System.out.println(StaticVariable.b);
		
		StaticVariable sv = new StaticVariable();
		StaticVariable sv1 = new StaticVariable();
		StaticVariable sv2 = new StaticVariable();
		//System.out.println(sv.b);
		sv1.b=800;
		System.out.println(sv1.b);
		System.out.println(sv2.b);
		System.out.println(sv.b);
		
		 
	}

}
