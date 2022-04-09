package OOPs_Concepts.inheritance;

public class MainClass {

	 public static void main(String[] args) {
		 ParentTesting pmt =  new ParentTesting();
		 pmt.smokeTesting();
		 pmt.regressionTesting();
		 pmt.process = "QA process";
		 System.out.println("Testing process - "+ pmt.process);
		   
		 ChildAutomationTesting cat = new ChildAutomationTesting();
		 cat.tool="Selenium";
		 cat.automationTesting();
		 System.out.println(cat.tool);
		 
		 
	 }
}
