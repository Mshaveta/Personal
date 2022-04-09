package OOPs_Concepts.inheritance;

public class ChildAutomationTesting extends ParentTesting {
	String tool;
	
	public void automationTesting() {
		 System.out.println("Automation Testing");
	 }
	
	 public static void main(String[] args) {
		 ChildAutomationTesting ct =  new ChildAutomationTesting();
		 ct.tool="Selenium";
		 ct.process="QA";
		 System.out.println(ct.tool);
		 System.out.println(ct.process);
		 ct.regressionTesting();
		 ct.smokeTesting();
		 ct.automationTesting();
	}
}
