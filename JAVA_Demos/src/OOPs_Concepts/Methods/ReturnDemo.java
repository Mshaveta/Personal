package OOPs_Concepts.Methods;

public class ReturnDemo {
	public void m1() {
		 System.out.println("m1");
	}
	public int m2() {
		int a=10;
		return a;
	}
	
	public String m3() {
		String str = "Jagroop";
		return str;
	}
	
	public char m4() {
		char ch = 'a';
		return ch;
	}

	public boolean m5() {
		return true;
	}
	
	public int[] m6() {
		int[] arr = {1,2,3};
		return arr;
	}
	
	public static void main(String[] args) {
		ReturnDemo rd = new ReturnDemo();
		System.out.println("in Main method....");
		rd.m1();
		int x = rd.m2();//m2 method is returning int type value and we can store the val in int type variable
		System.out.println(x);
		System.out.println(rd.m3());
		char ch = rd.m4();
		System.out.println("returning char type value -"+ch);
		System.out.println(rd.m5());
		rd.m6();
	}
}
