package OOPs_Concepts.Abstraction.Demotesting;

public class AboutUsPage extends BasePage{

	@Override
	public void pageContent() {
		 System.out.println("About Us Page Content");
		
	}
	
	public static void main(String[] args) {
		AboutUsPage ap = new AboutUsPage();
		ap.pageHeading="About Us";
		ap.pageContent();
	}

}
