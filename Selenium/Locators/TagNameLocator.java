package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {
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

    public void getAllLinks()  {
       // int sizeCount = driver.findElements(By.tagName("a")).size();
//        List elmnList = driver.findElements(By.tagName("a"));
//        System.out.println("Size - "+elmnList.size());
//        System.out.println("List - "+elmnList);
//        WebElement elmn = (WebElement) elmnList.get(15);
//        elmn.click();

        //or

        driver.findElements(By.tagName("a")).get(15).click();

    }

    public void fbLogin(){
        driver.findElements(By.tagName("input")).get(2).sendKeys("admin");
        driver.findElements(By.tagName("input")).get(3).sendKeys("admin123");
    }

    public void closeBrowser(){
        driver.close();
    }

    public static void main(String[] args) throws InterruptedException {
        TagNameLocator lTObj =  new TagNameLocator();
        lTObj.browserLaunch();
        lTObj.launchApp();
        lTObj.fbLogin();
        lTObj.getAllLinks();
        lTObj.closeBrowser();
    }
}
