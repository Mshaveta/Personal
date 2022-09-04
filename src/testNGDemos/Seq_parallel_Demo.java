package testNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Seq_parallel_Demo {
    WebDriver driver;

    @Parameters("browser") //ff
    @Test
    public void browserLaunch(String browserName){
        if(browserName.equalsIgnoreCase("firefox")){
            //FF - Browser Launch
            String driverPath = System.getProperty("user.dir")+"\\drivers\\geckodriver.exe";
            System.setProperty("webdriver.gecko.driver",driverPath);
            driver = new FirefoxDriver();

        }else if(browserName.equalsIgnoreCase("chrome")){
            //Chrome - Browser Launch
            String driverPath1 = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver",driverPath1);
            driver = new ChromeDriver();
        }
        //Window maximize:
        driver.manage().window().maximize();
    }

    @Test
    public void launchApp(){
        //launch the application
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Test
    public void loginApp() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.className("orangehrm-login-button")).click();
    }
}
