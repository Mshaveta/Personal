package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathLocator {
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
        driver.get("https://www.facebook.com/");
    }

    public void enterUsername()  {
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("adbc@gmail.com");

    }

    public void closeBrowser(){
        driver.close();
    }

    public static void main(String[] args) throws InterruptedException {
        xPathLocator lTObj =  new xPathLocator();
        lTObj.browserLaunch();
        lTObj.launchApp();
        lTObj.enterUsername();
        Thread.sleep(1000);
        lTObj.closeBrowser();
    }
}
