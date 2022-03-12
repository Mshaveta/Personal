package OOPs_Concepts.Encapsulation;

public class MainClass {

	public static void main(String[] args) {
		EncapsDemo ed =  new EncapsDemo();
		 ed.setAccountNo(2427645647656756775L);
		 System.out.println(ed.getAccountNo());
		 
		 System.out.println("=================================");
		 EncapsDemo2 ed2 =  new EncapsDemo2();
 		 ed2.setA(10);
		 ed2.setB(20);
		 ed2.setC(30);
		 
		 System.out.println(ed2.getA());
		 System.out.println(ed2.getB());
		 System.out.println(ed2.getC());
	}

}
