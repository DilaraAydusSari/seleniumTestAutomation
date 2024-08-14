package Pages;

import Base.Data;
import org.openqa.selenium.By;

public class MainPage extends Data {

    public MainPage clickOneTrustClose() {
        driver.findElement(By.cssSelector("[class*='banner-close-button ot-close-icon']")).click();
        return this;
    }
}
