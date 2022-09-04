package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
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

    public void loginApp() throws InterruptedException {
        driver.findElement(By.name("txtUsername")).sendKeys("Shaveta");
        driver.findElement(By.name("txtPassword")).sendKeys("Shaveta@123");
        Thread.sleep(2000);
        driver.findElement(By.name("Submit")).click();
    }

    public static void main(String[] args) throws InterruptedException {
        NameLocator nlObj =  new NameLocator();
        nlObj.browserLaunch();
        nlObj.launchApp();
        nlObj.loginApp();

    }
}
