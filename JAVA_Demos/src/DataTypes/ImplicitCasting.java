package DataTypes;

public class ImplicitCasting {

	public static void main(String[] args) {
		 byte b=10;//1
		 short s = b;//short size- 2
		 
		 System.out.println("value of b is-"+b);
		 System.out.println("value of s is-"+s);
		 
		 short s1 =200;//2_ _ 32367
		 int b1 =  s1;//1_----> +127
		 System.out.println(b1);
		 System.out.println(s1);
		 
		 int i =12;
		 long l = i;
		 System.out.println(i);
		 System.out.println(l);
		 
		 float ft = l;
		 System.out.println(ft);//12.0
		 
		 double d = 45;
		 System.out.println(d);
		 
		 

	}

}
