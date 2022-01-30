package OOPs_Concepts.Methods;

public class NonParametericMethod {
	 	
	// user defined / non static / non -parameteric method
	//method defintion
	public void m1() {
		System.out.println("inside in m1 non static method.....");//3
	}
	
	public static void m2() {
		System.out.println("inside in m2 static method ");//2
	}

	public static void main(String[] args) {
		System.out.println("In main Method....");//1
		
		NonParametericMethod npm = new NonParametericMethod();
		npm.m1(); //method calling
		
		m2();
	}

}
