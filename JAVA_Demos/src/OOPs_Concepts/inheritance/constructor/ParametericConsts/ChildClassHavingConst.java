package OOPs_Concepts.inheritance.constructor.ParametericConsts;

/*
 * if parent class and childclass is having non parameteric const then it will call the 
 * const of parent class first then const of child class  
 * How? - JVM calls the default const of child class while object creation and
 *  calls the parent's class const by using super() method
 * */

public class ChildClassHavingConst extends ParentClassHavingConst {
	 public ChildClassHavingConst() {
		 System.out.println("Child class non parameteric Const");
	 }
	public static void main(String[] args) {
		ChildClassHavingConst ct =  new ChildClassHavingConst();
	}
}
