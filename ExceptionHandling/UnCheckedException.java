package OOPs_Concepts.ExceptionHandling;

import java.util.Scanner;

public class UnCheckedException {
	
	public void arithmeticExecption(int a, int b) {
		try {
			int c =  a/b;//2
			System.out.println(c);
		}catch(ArithmeticException e){
			//System.out.print(e);
			//System.out.print(e.getMessage());
			e.printStackTrace();
		}
	}
	
	
	public void nullPointerException(String str) { //str - test
		try {
			str = null;
			System.out.print(str.length());
			 
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void arrayIndexOutOfBoundException( ) { //str - test
		try {
			 
			int[] arr = {1,2,3,4,5}; //0-4, Total length =5
			System.out.print(arr[10]);//3
			 
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	public void tryCatchFinally() {
		String st="Test";
		try {
			System.out.print(st.length());
			 
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			System.out.println("Finally block...");
		}
	}
	
	public void tryFinally() {
		String st=null;
		try {
			System.out.print(st.length());
		}finally {
			System.out.println("Finally block...");
			System.out.println("Finally block2...");
			System.out.println("Finally block3...");
		}
	}
	
	
	public static void main(String[] args) {
		UnCheckedException ue = new UnCheckedException();
//		System.out.println("Start Execution....");
//		Scanner scn =  new Scanner(System.in);
		
//		System.out.println("Enter a number");
//		int a =scn.nextInt();
//		System.out.println("Enter second number");
//		int b = scn.nextInt();
//		ue.arithmeticExecption(a,b);
		///////////////////////////////////////////////////////////////////
//		System.out.println("Enter String type value");
//		String name = scn.next();//test
//		ue.nullPointerException(name);
//		 
		
///////////////////////////////////////////////////////////////////
		//ue.arrayIndexOutOfBoundException();
		ue.tryFinally();
		System.out.println("end Execution....");
	}

}
