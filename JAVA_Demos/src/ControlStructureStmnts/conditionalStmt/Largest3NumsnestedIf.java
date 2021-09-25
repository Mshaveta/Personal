package ControlStructureStmnts.conditionalStmt;

public class Largest3NumsnestedIf {

	public static void main(String[] args) {
		int a = 150;
		int b = 112;
		int c = 53;
		
		if(a>b) {
			if(a>c) {
				System.out.println("a is largest");
			}else {
				System.out.println("c is largest");
			}
		}else {
			if(b>c) {
				System.out.println("b is largest");
			}else {
				System.out.println("c is largest");
			}
		}

	}

}
