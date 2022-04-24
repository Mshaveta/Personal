package OOPs_Concepts.Polymorphism;

public class MainMethodOverloading {

	public static void main(int[] args) {
		System.out.println("main Method with int");
	}

	public static void main(String[] args) { // JVM starts the execution from this method
		System.out.println("MainMethodOverloading");
		int[] arr = {1,2,3,4};
		main(arr);
	}

}
