import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void launchBrowser(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver =  new ChromeDriver();
    }
}
