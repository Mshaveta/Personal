package stepDefintion;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    WebDriver driver;
    @Given("The user launches the application")
    public void userLaunchesTheApplication(){
        WebDriverManager.chromedriver().setup();
        driver =  new ChromeDriver();
        driver.get("https://www.facebook.com/");
    }

    @When("The user enters the username and password")
    public void userEntersTheusernameAndPassword(){
        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("abc123");
    }

    @When("The user clicks on Login button")
    public void the_user_clicks_on_Login_button() {
        System.out.println("click on Login");
    }

    @When("The user enters the inVlaid username and invalid Password")
    public void userEntersTheInvalidUsernameAndInValidPassword(){
        System.out.println("userEntersTheInvalidUsernameAndInValidPassword");
    }

    @Then("The user should not be able to see the Home page")
    public void homepageShouldNotBeDisplayed(){
        System.out.println("homepageShouldNotBeDisplayed");
    }


}
