package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextLocator {
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
        driver.findElement(By.partialLinkText("Forgot your password")).click();
        driver.findElement(By.partialLinkText("OrangeHRM")).click();
    }

    public static void main(String[] args) throws InterruptedException {
        PartialLinkTextLocator pLTObj =  new PartialLinkTextLocator();
        pLTObj.browserLaunch();
        pLTObj.launchApp();
        pLTObj.clickForgotPwdLink();

    }
}
