package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathLocator_way2 {
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

    //way2: content between 2 tags with exact text
    public void isHeadingDisplayed()  {
        boolean isPresent = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the " +
                "people in your " +
                "life" +
                ".']")).isDisplayed();
       if(isPresent){
           System.out.println("Yes, element is present");
           String pageHeading = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with " +
                   "the " +
                   "people in your " +
                   "life" +
                   ".']")).getText();
           System.out.println(pageHeading);
       }else{
           System.out.println("no, element is not present");
       }
    }


    public void isHeadingDisplayedWithSingleElementXpath()  {
       WebElement element = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the " +
                "people in your life.']"));
       boolean isPresent = element.isDisplayed();
        if(isPresent){
            System.out.println("Yes, element is present");
            String pageHeading = element.getText();
            System.out.println(pageHeading);
        }else{
            System.out.println("no, element is not present");
        }
    }

    //way3: content between 2 tags with partial text
    public void isHeadingDisplayedWithPartialText()  {
        boolean isPresent =
                driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect')]")).isDisplayed();
        if(isPresent){
            System.out.println("Yes, element is present");
            String pageHeading = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect')]")).getText();
            System.out.println(pageHeading);
        }else{
            System.out.println("no, element is not present");
        }
    }

    public void closeBrowser(){
        driver.close();
    }

    public static void main(String[] args) throws InterruptedException {
        xPathLocator_way2 lTObj =  new xPathLocator_way2();
        lTObj.browserLaunch();
        lTObj.launchApp();
        lTObj.isHeadingDisplayedWithPartialText();
        Thread.sleep(1000);
        lTObj.closeBrowser();
    }
}
