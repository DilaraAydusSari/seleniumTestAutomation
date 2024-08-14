package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Data{
    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.get(url);
    }
}
