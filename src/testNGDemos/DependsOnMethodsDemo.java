package testNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodsDemo {
    WebDriver driver;
    @Test
    public void browserLaunch(){
        //Browser Launch
        String driverPath = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
        System.setProperty("webdriverchrome.driver",driverPath);
        driver = new ChromeDriver();

        //Window maximize:
        driver.manage().window().maximize();
    }

    @Test(dependsOnMethods = "browserLaunch")
    public void appLaunch(){
        //launch the application
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Test(dependsOnMethods = "appLaunch")
    public void loginApp() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.className("orangehrm-login-button")).click();
    }
}
