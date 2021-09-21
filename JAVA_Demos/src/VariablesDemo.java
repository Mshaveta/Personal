
public class VariablesDemo {

	public static void main(String[] args) {
		System.out.println("Hello JAVA");
		
		int a=10;// declaration and value Assignment/initialization
		System.out.println(a);//10
		System.out.println("a");//a
		System.out.println("Value of a is - a");
		System.out.println("Value of a is -" + a);
		System.out.println(a + " value is");//10 value is
		
		int b=2;
		int c=3;
		System.out.println(b+c);//5
		System.out.println("Sum is - "+b+c);//Sum is - 23
		System.out.println(b+c +"Sum is - ");//5 Sum is-
		// first '+' opr is treating as addition operator, scnd one concatenate opt
		System.out.println("Sum is - "+(b+c));//Sum is 5
		System.out.println("Sum of "+b+" and "+c +" is- "+ (b+c));//Sum of 2 and 3 is- 5
	}

}
