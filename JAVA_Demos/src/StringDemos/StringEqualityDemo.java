package StringDemos;
/*
 * == compares the memory addresses
 * equals() compares the sequence of chars
 */
public class StringEqualityDemo {
	public static void main(String[] args) {
//		int a=10;
//		int b=10;
//		if(a==b) {
//			System.out.println("Matched ");
//		}else {
//			System.out.println("Not Matched");
//		}

		// literal way
		String s1 = "test";
		String s2 = "TEST";
		//String s3 = "test";
		String s3 = new String("test");

//		if (s1 == s3) {
//			System.out.println("Matched");
//		} else {
//			System.out.println("Not Matched");
//		}
//		if(s1==s2) {
//			System.out.println("Matched ");
//		}else {
//			System.out.println("Not Matched");
//		}
		
		
		//equals
		String s5 = new String("test");//Heap M/m
		String s6 = "test";//SCP
		
		if(s5.equals(s6)){ //matches the seq. of chars
			System.out.println("matched");
		}else {
			System.out.println("Not Matched");
		}
		
		
		String expectedTitle = "facebook";
		String actualTitle = "FaceBook";
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Matched!");
		}else {
			System.out.println("Not Matched!");
		}
		
	}
}
