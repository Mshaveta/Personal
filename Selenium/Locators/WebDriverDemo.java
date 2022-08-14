package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {
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

    public void loginApp(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
    }

    public static void main(String[] args) {
        WebDriverDemo wdd =  new WebDriverDemo();
        wdd.browserLaunch();
        wdd.launchApp();
        wdd.loginApp();

    }
}
