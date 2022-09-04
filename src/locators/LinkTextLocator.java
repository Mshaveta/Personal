package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {
    WebDriver driver;

    public void browserLaunch(){
        //Browser Launch
        String driverPath = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        driver = new ChromeDriver();

        //Window maximize:
        driver.manage().window().maximize();
    }

    public void launchApp(){
        //launch the application
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    public void clickForgotPwdLink() throws InterruptedException {
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
    }

    public static void main(String[] args) throws InterruptedException {
        LinkTextLocator lTObj =  new LinkTextLocator();
        lTObj.browserLaunch();
        lTObj.launchApp();
        lTObj.clickForgotPwdLink();

    }
}
