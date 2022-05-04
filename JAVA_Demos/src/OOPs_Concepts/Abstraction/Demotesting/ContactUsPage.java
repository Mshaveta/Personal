package OOPs_Concepts.Abstraction.Demotesting;

public class ContactUsPage extends BasePage {

	@Override
	public void pageContent() {
		System.out.println("Contact Us Page Content");

	}

	public static void main(String[] args) {
		ContactUsPage cp = new ContactUsPage();
		cp.pageHeading="Contact Us";
		cp.pageContent();
	}
}
