package OOPs_Concepts.ThisKeyword;

/*
 * Const. chaining: Calling of one const into the another const. using this()
 * this() should be the first statement in the const.
 * we can't use multiple this() within one const.
 */
public class UseOfThisInConst {
	public UseOfThisInConst() {
		this(10);
		System.out.println("Const without params");
	}

	public UseOfThisInConst(int a) {
		this("String");
		System.out.println("Const with params");
	}
	
	public UseOfThisInConst(String a) {
		System.out.println("Const with String param.");
	}

	public void m1() {
		UseOfThisInConst utc = new UseOfThisInConst();
	}
	public static void main(String[] args) {
		UseOfThisInConst utc = new UseOfThisInConst();
	}

}
