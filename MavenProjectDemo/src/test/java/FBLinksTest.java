import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FBLinksTest {
    WebDriver driver;
    @BeforeClass
    public void launchBrowser(){
        WebDriverManager.chromedriver().setup();
        driver =  new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void linksClickability(){
        //get the count of links
         int linksCount = driver.findElements(By.xpath("//ul[contains(@class,'pageFooterLinkList')]/li")).size();

         for(int index=1;index<linksCount;index++){
             //get the  name of Link
             String linkName = driver.findElement(By.xpath("//ul[contains(@class,'pageFooterLinkList')]/li["+index+
                     "]/a")).getText();

             if(linkName.equalsIgnoreCase("Instagram")){
                 continue;
             }

             //get the url of link
             String linkURL = driver.findElement(By.xpath("//ul[contains(@class,'pageFooterLinkList')]/li["+index+
                     "]/a")).getAttribute("href");
             System.out.println(linkURL);

             //navigate to link url
             driver.navigate().to(linkURL);

             //to get the title of page
             System.out.println("Title of page - "+ driver.getTitle());

             //to get the current Url of Page
             System.out.println("Title of page - "+ driver.getCurrentUrl());

             //back to page
             driver.navigate().back();
         }
    }
}
