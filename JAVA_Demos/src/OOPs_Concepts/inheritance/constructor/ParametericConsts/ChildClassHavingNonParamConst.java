package OOPs_Concepts.inheritance.constructor.ParametericConsts;

import OOPs_Concepts.inheritance.constructor.NonParametericConsts.ParentClassHavingConst;

public class ChildClassHavingNonParamConst extends ParentClassHavingParametericConst {
	

	public ChildClassHavingNonParamConst() {
		 super(10);
	}

	public static void main(String[] args) {
		ChildClassHavingNonParamConst ct = new ChildClassHavingNonParamConst();
	}
}
