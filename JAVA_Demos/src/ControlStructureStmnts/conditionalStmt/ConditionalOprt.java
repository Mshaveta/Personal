package ControlStructureStmnts.conditionalStmt;

public class ConditionalOprt {
	public static void main(String[] args) {
		int a=500;
		int b=100;
		System.out.println(a==b);//true
		System.out.println(a>b);//false
		System.out.println(a<b);//false
		System.out.println(a<=b);//either lessthan or equal to
		System.out.println(a>=b);//either lessthan or equal to
		System.out.println(a!=b);//true
		if(a==b) {
			System.out.println(a+" and "+b +" is equal");
		}
	}
}
