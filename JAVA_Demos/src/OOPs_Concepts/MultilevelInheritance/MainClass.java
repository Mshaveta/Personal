package OOPs_Concepts.MultilevelInheritance;

public class MainClass {

	public static void main(String[] args) {
		APITesting apiObj =  new APITesting();
		System.out.println(apiObj.process);
		System.out.println(apiObj.tool3);
		System.out.println(apiObj.tool1);
		System.out.println(apiObj.tool2);
		apiObj.apiTesting();
		apiObj.functionalTesting();
		apiObj.automationTesting();

	}

}
