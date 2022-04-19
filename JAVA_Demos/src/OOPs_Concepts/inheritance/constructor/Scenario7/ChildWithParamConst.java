package OOPs_Concepts.inheritance.constructor.Scenario7;

public class ChildWithParamConst extends ParentWithParamConst {
	public ChildWithParamConst(int a,int b) {
		super(b);
		System.out.println("ChildWithParamConst...."+ a);
		System.out.println("ChildWithParamConst...."+ b);
	}

	public static void main(String[] args) {
		ChildWithParamConst obj = new ChildWithParamConst(1000,2000);
	}
}
