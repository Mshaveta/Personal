package OOPs_Concepts.Abstraction;

abstract public class WithoutInheritanceAbstraction {
	int a = 100;

	public void nonAbstractMethod() {
		System.out.println("Non Abstract Method...");
	}

	abstract public void abstractMethod();

	public static void main(String[] args) {
		WithoutInheritanceAbstraction obj = new WithoutInheritanceAbstraction() {

			@Override
			public void abstractMethod() {
				System.out.println("abstractMethod overidden...");
			}
		};
		
		System.out.println(obj.a);
		obj.nonAbstractMethod();
		obj.abstractMethod();
	}
}
