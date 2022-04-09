package OOPs_Concepts.inheritance.constructor;

/*
 * if parent class is having non parameteric const and child doesn't have then on the 
 * object of child class creation , 
 * it automatically calls the const of parent class
 * 
 * How? - JVM calls the default const of child class while object creation and
 *  calls the parent's class const by using super() method
 * */

public class ChildClassHavingConst extends ParentClassHavingNoConst {
	 public ChildClassHavingConst() {
		 System.out.println("ChildClassHavingConst");
	 }
	public static void main(String[] args) {
		ChildClassHavingConst ct =  new ChildClassHavingConst();
	}
}
