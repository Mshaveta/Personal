package ControlStructureStmnts.conditionalStmt;

public class ORLogicalOpt {

	public static void main(String[] args) {
		 int username=700;
		 int email = 1234;
		 int password=345;
		 int dob=789;
		 if((username ==123 || email==1234) && (password==8345 || dob==789)) {
			 System.out.println("Matched ");
		 }else {
			 System.out.println("not matched!");
		 }

	}

}
