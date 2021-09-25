package ControlStructureStmnts.conditionalStmt;

public class LogicalOptEx2 {

	public static void main(String[] args) {
		int marks =100;
		if(marks>=0 && marks<=50) {
			System.out.println("Average");
		}else if(marks>=51 && marks<=70) {
			System.out.println("Good");
		}else if(marks>=71 && marks<=85) {
			System.out.println("V.Good");
		}else if(marks>=85 && marks<=100) {
			System.out.println("Excellent");
		}
		
		
		boolean checkTerms = false;
		if(!checkTerms ) { //!false==true
			System.out.println("checked");
		}else {
			System.out.println("not checked");
		}
		
		
		

	}

}
