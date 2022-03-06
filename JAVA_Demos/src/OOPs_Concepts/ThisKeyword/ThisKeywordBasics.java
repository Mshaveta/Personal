package OOPs_Concepts.ThisKeyword;
/*
 * 'This' keyword refers to current object of current class
 *  this keyword can be used with Variables, in Const and methods
 *  We can't use 'this' keyword in static Areas/methods.
 *  
 *  Variables/Methods: When name of Local varibale and instance variabkle is same then to differeiante both the variabkle we use this keyword with instance var.
 *  for eg.: this. instVar = localvar
 *  
 *  
 */
public class ThisKeywordBasics {
	int a;
	int b;
	public ThisKeywordBasics(int a) {
		System.out.println("Value of this KW - "+this);
		this.a = a;
		System.out.println("Value of a is - "+ a );
	}
		
	public void m1(int b) {
		this.b = b;
	}

	public static void main(String[] args) {
		ThisKeywordBasics tkb = new ThisKeywordBasics(100);
		System.out.println("Value of class object-"+ tkb);
		System.out.println("====================================");
		
		ThisKeywordBasics tkb1 = new ThisKeywordBasics(100);
		System.out.println("Value of class object2-"+ tkb1);
		System.out.println("====================================");
		System.out.println("Value of instance Varibale a is - "+tkb.a);
		
		tkb.m1(12);
		System.out.println("Value of b is-"+tkb.b);
		
		 

	}

}
