package DataTypes;

public class ExplicitTypeCasting {
	public static void main(String[] args) {
		//numeric 
		long a = 1234567959958985977L;//8 bytes 64 bits
		int i = (int)a;//4
		System.out.println(i);
		
		int b=32798989;
		short sh = (short)b;
		System.out.println(sh);
		
		double d = 90.45;//8 bytes
		float f = (float) d;//4 bytes
		System.out.println(f);
		
		
		char ch ='a';
		int n = ch;
		System.out.println(n);//97
		
		int x = 66;
		char chr = (char) x;
		System.out.println(chr);//B
		 
		
	}
}
