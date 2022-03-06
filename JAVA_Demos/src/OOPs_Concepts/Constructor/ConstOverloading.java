package OOPs_Concepts.Constructor;

public class ConstOverloading {
	public ConstOverloading() {
		System.out.println("ConstOverloading without params");
	}

	public ConstOverloading(int a) {
		System.out.println("ConstOverloading with params- "+a);
	}
	
	public ConstOverloading(String a) {
		System.out.println("ConstOverloading with String as params- "+a);
	}
	
	public ConstOverloading(String a, int b) {
		System.out.println("ConstOverloading with String and int as params- "+a);
	}
	
	public ConstOverloading(int b, String a) {
		System.out.println("ConstOverloading with  int and String as params- "+a);
	}

	public static void main(String[] args) {
		ConstOverloading co = new ConstOverloading(10);
		ConstOverloading co1 = new ConstOverloading();
		ConstOverloading co2 = new ConstOverloading("AbC",789);
	}

}
