package StringDemos;

public class StringBasics {

	public static void main(String[] args) {
		//1. literal way
		String str="test";
		System.out.println(str);
		
		//2. using new keyword
		String str1= new String("Demo");
		System.out.println(str1);
		
		System.out.println(str1.concat(str));
		System.out.println(str1);
		
		str1 = str1.concat(str);
		System.out.println(str1);

	}

}
