package ControlStructureStmnts.conditionalStmt;

public class NestedifElseDemo {

	public static void main(String[] args) {
		 if(false) {			 
			 System.out.println("Outer if....");
			 
			 if(false) {
				 System.out.println("inner if....");
			 }else {
				 System.out.println("inner else....");
			 }
			 
		 }else {
			 System.out.println("Outer else...."); 
			 if(false) {
				 System.out.println("inner if in Outer else part....");
			 }else {
				 System.out.println("inner else in Outer else part....");
			 }
		 }
	}

}
