package ControlStructureStmnts.conditionalStmt;

public class DiffOprnsSCase {

	public static void main(String[] args) {
		String op = "div";
		int a = 10;
		int b = 5;
		int res = 0;
		switch (op) {
		case "sub":
			res = a - b;
			break;
		case "div":
			res = a  / b;
			break;
		case "mul":
			res = a * b;
			break;
		case "add":
			res = a + b;
			break;
		case "mod":
			res = a % b;
			break;
		default:
			System.out.println("Please choose the opn' out of : add, sub, mul, div, mod");
		}
		
		System.out.println("Result is-"+res);

	}

}
