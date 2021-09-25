package ControlStructureStmnts.conditionalStmt;

public class LergestNumberoutofThree {

	public static void main(String[] args) {
		 int a=590;
		 int b=234;
		 int c=817;
		 
		 if( (a>b) && (a>c)) {
			 System.out.println(" a is largest");
		 }else if ( (b>a) && (b>c)) {
			 System.out.println(" b is largest"); 
		 }else {
			 System.out.println("c is largest");
		 }
	}

}
