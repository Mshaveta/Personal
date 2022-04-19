package OOPs_Concepts.inheritance.constructor.Scenario6;

public class ChildWithParamConst extends ParentWithDefaultConst {
	public ChildWithParamConst(int a) {
		System.out.println("ChildWithParamConst...."+ a);
	}

	public static void main(String[] args) {
		ChildWithParamConst obj = new ChildWithParamConst(1000);
	}

}
