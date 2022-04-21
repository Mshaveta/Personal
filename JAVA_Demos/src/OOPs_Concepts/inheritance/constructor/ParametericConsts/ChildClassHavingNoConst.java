package OOPs_Concepts.inheritance.constructor.ParametericConsts;


public class ChildClassHavingNoConst extends ParentClassHavingParametericConst {
	 

	public ChildClassHavingNoConst() {
		super(10);
	}

	public static void main(String[] args) {
		ChildClassHavingNoConst ct = new ChildClassHavingNoConst();
	}
}
