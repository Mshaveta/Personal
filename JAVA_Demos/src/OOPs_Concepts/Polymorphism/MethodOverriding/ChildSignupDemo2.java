package OOPs_Concepts.Polymorphism.MethodOverriding;

public class ChildSignupDemo2 extends ParentSignupDemo {

	public String signUp() {
		return "Signup to Web Application by using Social media app. option";
	}
 
//	public static void login() {
//		System.out.println("login to Web Application by using Social media");
//	}
 	
	 

	public void doSignUp(boolean isAccountOption) {
		if (isAccountOption) {
			signUp();// calling of child class method
		} else {
			super.signUp(); //calling of super/parent class method
		}
	}

}
