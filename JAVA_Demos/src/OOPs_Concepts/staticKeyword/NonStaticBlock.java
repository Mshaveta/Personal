package OOPs_Concepts.staticKeyword;

public class NonStaticBlock {

	// Non sttaic Block
	{
		System.out.println("Non static Block");
	}

	public NonStaticBlock() {
		System.out.println("Constructor");
	}

	// sttaic Block
	static {
		System.out.println("Static Block");
	}

	public static void main(String[] args) {
		NonStaticBlock obj = new NonStaticBlock();
	}
}
