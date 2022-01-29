package OOPs_Concepts.Variables;

/*
 * Instance Variable is also know as non static variable (we are not using static keyword)
 * position: inside the class and outside the method
 * level: object level variable
 * No need to initialise the instance variable at the time of declaration
 * By default value of instance variable is according to it's data type.
   for eg: int - 0,float- 0.0, boolean- false, String-null
 * Instance variables get initialised and memory allocation at the time of object creation 
 * Access:we can't access nonstatic variable in static area/method directly, 
   but can be accessible with the object of class
   - we can access the instance variable directly in nonstatic method
 * Why instance variablke is known as object level variable?-  because instance variable get 
   initiliased at the time of object creation
 * Value of instance variable varies as we create different objects of class
 */
public class InstanceVariables 
{
	int a=100; //field/property/nonstatic Variable/instance var
	
	public void nonStaticMethod() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		//creating an object of class
		InstanceVariables obj = new InstanceVariables();
		InstanceVariables obj1 = new InstanceVariables();
		InstanceVariables obj2 = new InstanceVariables();
		InstanceVariables obj3 = new InstanceVariables();
		obj3.a=900;
		System.out.println(obj.a);
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		System.out.println(obj3.a);
	}

}
