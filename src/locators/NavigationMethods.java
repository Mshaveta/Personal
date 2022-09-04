package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {
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

    public void navigateToForgetPassword()  {
        driver.findElement(By.partialLinkText("Forgotten password")).click();
        driver.findElement(By.id("identify_email")).sendKeys("shaveta@gmail.com");
        //To click on Browser's back button
        driver.navigate().back();
    }

    public void loginApp() throws InterruptedException {
        driver.findElements(By.className("inputtext")).get(0).sendKeys("admin");
        driver.findElements(By.className("inputtext")).get(1).sendKeys("admin123");
    }
    public void closeBrowser(){
        driver.close();
    }

    public static void main(String[] args) throws InterruptedException {
        NavigationMethods nlObj =  new NavigationMethods();
        nlObj.browserLaunch();
        nlObj.launchApp();
        nlObj.navigateToForgetPassword();
        nlObj.loginApp();
        nlObj.closeBrowser();

    }
}
