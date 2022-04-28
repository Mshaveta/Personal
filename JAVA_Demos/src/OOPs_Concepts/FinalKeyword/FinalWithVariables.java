package OOPs_Concepts.FinalKeyword;

//final public class FinalWithVariables {
public class FinalWithVariables {
	final int a = 0;
	final int b;

	final static int c = 100;
	final static int d = 890;

	public FinalWithVariables() {
		this.b = 10;
		//this.b = 20;
	}

	final public void m1() {
		System.out.println("m1 in parent class");
	}

	public static void main(String[] args) {
		FinalWithVariables pc = new FinalWithVariables();
		System.out.println(pc.a);
		// pc.a=100;
		System.out.println(pc.a);
		// c=190;
	}
}
